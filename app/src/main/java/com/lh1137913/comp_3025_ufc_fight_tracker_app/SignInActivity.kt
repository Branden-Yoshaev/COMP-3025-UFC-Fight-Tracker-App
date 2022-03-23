package com.lh1137913.comp_3025_ufc_fight_tracker_app

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textfield.TextInputEditText
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase

class SignInActivity : AppCompatActivity() {

    private val ref = FirebaseAuth.getInstance()

    //    private latent var auth: FirebaseAuth
    override fun onCreate(savedInstanceState: Bundle?) {
//        auth = Firebase.auth
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)

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
}

//        buttonSignUp.setOnClickListener {
//            val inputMethodManager = getSystemService(INPUT_METHOD_SERVICE) as InputMethodManager
//            inputMethodManager.hideSoftInputFromWindow(currentFocus!!.windowToken, 0)
//            if (editTextEmail.text.toString().isNullOrEmpty() || editTextPassword.text.toString()
//                    .isNullOrEmpty())
//                textViewResponse.text = "Email Address or Password is not provided"
//            else {
//                auth.createUserWithEmailAndPassword(
//                    editTextEmail.text.toString(),
//                    editTextPassword.text.toString())
//                    .addOnCompleteListener(this) { task ->
//                        if (task.isSuccessful) {
//                            textViewResponse.text =
//                                "Sign Up successful. Email and Password created"
//                            val user = auth.currentUser
//                            updateUI(user)
//                        } else {
//                            textViewResponse.text = "Sign Up Failed"
//                            updateUI(null)
//                        }
//                    }
//            }
//        }
//    }
//    private fun updateUI(currentUser: FirebaseUser?) {
//
//    }
