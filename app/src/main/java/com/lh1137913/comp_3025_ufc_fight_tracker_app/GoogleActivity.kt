package com.lh1137913.comp_3025_ufc_fight_tracker_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser
import com.lh1137913.comp_3025_ufc_fight_tracker_app.databinding.ActivityGoogleBinding

class GoogleActivity : AppCompatActivity() {

    //view binding
    private lateinit var binding: ActivityGoogleBinding

    //firebase auth
    private lateinit var firebaseAuth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityGoogleBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //init firebase auth
        firebaseAuth = FirebaseAuth.getInstance()
        checkUser()

        //logout user
        binding.logOutBtn.setOnClickListener {
            firebaseAuth.signOut()
            checkUser()
        }

        //Continue to ufc upcoming events
        val continueBtn = findViewById<Button>(R.id.continueBtn)!!
        continueBtn.setOnClickListener {
            val Intent = Intent(this, UFCUpcomingEvents::class.java)
            startActivity(Intent)
        }
    }

    private fun checkUser() {
        val firebaseUser = firebaseAuth.currentUser
        if (firebaseUser == null){
            //not logged in
            startActivity(Intent(this, SignInActivity::class.java))
            finish()
        }
        else{
            //user logged in
            //get user info
            val email = firebaseUser.email

            //set email
            binding.emailTv.text = email
        }
    }
}