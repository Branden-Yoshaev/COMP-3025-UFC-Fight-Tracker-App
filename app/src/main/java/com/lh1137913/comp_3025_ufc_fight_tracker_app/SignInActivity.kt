package com.lh1137913.comp_3025_ufc_fight_tracker_app

import android.content.Intent
import android.nfc.Tag
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.gms.auth.api.signin.GoogleSignIn
import com.google.android.gms.auth.api.signin.GoogleSignInAccount
import com.google.android.gms.auth.api.signin.GoogleSignInClient
import com.google.android.gms.auth.api.signin.GoogleSignInOptions
import com.google.android.gms.common.api.ApiException
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.GoogleAuthProvider
import com.lh1137913.comp_3025_ufc_fight_tracker_app.databinding.ActivitySignInBinding
import java.lang.Exception


class SignInActivity : AppCompatActivity() {

    private val ref = FirebaseAuth.getInstance()

    //view binding
    private lateinit var binding: ActivitySignInBinding

    private lateinit var googleSignInClient: GoogleSignInClient
    private lateinit var firebaseAuth: FirebaseAuth

    //const
    private companion object{
        private const val RC_SIGN_IN = 100
        private const val TAG = "GOOGLE_SIGN_IN_TAG"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignInBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //config google signin
        val googleSignInOptions = GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
            .requestIdToken(getString(R.string.default_web_client_id))
            .requestEmail() //Only need email from google accnt
            .build()
        googleSignInClient = GoogleSignIn.getClient(this, googleSignInOptions)

        //firebase auth
        firebaseAuth = FirebaseAuth.getInstance()
        checkUser()

        //Google sign In btn
        binding.googleSignInBtn.setOnClickListener {
            Log.d(TAG, "onCreate: begin Google SignIn")
            val intent = googleSignInClient.signInIntent
            startActivityForResult(intent, RC_SIGN_IN)
        }

        val email = findViewById<EditText>(R.id.editTextEmail)
        val password = findViewById<EditText>(R.id.editTextPassword)
        val signUp = findViewById<Button>(R.id.buttonSignUp)

        signUp.setOnClickListener {
            ref.createUserWithEmailAndPassword(
                email.text.toString().trim(),
                password.text.toString().trim()
            )
        }

        //Sign Up Button
        val signUpBtn = findViewById<Button>(R.id.buttonSignUp)
        signUpBtn.setOnClickListener {
            val Intent = Intent(this, UFCUpcomingEvents::class.java)
            startActivity(Intent)
        }

    }

    private fun checkUser() {
        // check if user is logged in or not
        val firebaseUser = firebaseAuth.currentUser
        if (firebaseUser != null) {
            //user is already logged in
            startActivity(Intent(this@SignInActivity, GoogleActivity::class.java))
            finish()
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        //Result from launching Intent from google sign in
        if (requestCode == RC_SIGN_IN) {
            Log.d(TAG, "onActivityResult: Google SignIn intent result")
            val accountTask = GoogleSignIn.getSignedInAccountFromIntent(data)
            try {
                //google signIn, auth with firebase
                val account = accountTask.getResult(ApiException::class.java)
                firebaseAuthWithGoogleAccount(account)
            } catch (e: Exception) {
                //Failed sign in
                Log.d(TAG, "onActivityResult: ${e.message}")
            }
        }
    }

    private fun firebaseAuthWithGoogleAccount(account: GoogleSignInAccount?) {
        Log.d(TAG, "firebaseAuthWithGoogleAccount: begin firebase auth with google account")

        val credential = GoogleAuthProvider.getCredential(account!!.idToken, null)
        firebaseAuth.signInWithCredential(credential)
            .addOnSuccessListener { authResult ->
                //login success
                Log.d(TAG, "firebaseAuthWithGoogleAccount: LoggedIn")

                //get loggedIn user
                val firebaseUser = firebaseAuth.currentUser
                //get user info
                val uid = firebaseUser!!.uid
                val email = firebaseUser.email

                Log.d(TAG, "firebaseAuthWithGoogleAccount: Uid: $uid")
                Log.d(TAG, "firebaseAuthWithGoogleAccount: Email: $email")

                //check if user new or exists
                if (authResult.additionalUserInfo!!.isNewUser){
                    Log.d(TAG, "firebaseAuthWithGoogleAccount: Account created.. \n$email")
                    Toast.makeText(this@SignInActivity, "Account created... \n$email", Toast.LENGTH_LONG).show()
                }
                else{
                    //existing users
                    Log.d(TAG, "firebaseAuthWithGoogleAccount: Existing user.. \n$email")
                    Toast.makeText(this@SignInActivity, "Logged In... \n$email", Toast.LENGTH_SHORT).show()
                }

                // show profile
                startActivity(Intent(this@SignInActivity, GoogleActivity::class.java))
                finish()
            }
            .addOnFailureListener { e ->
                //login failed
                Log.d(TAG, "firebaseAuthWithGoogleAccount: Loggin Failed due to... ${e.message}")
                Toast.makeText(this@SignInActivity, "Loggin Failed due to ... ${e.message}", Toast.LENGTH_SHORT).show()
            }
    }
}