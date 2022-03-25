package com.lh1137913.comp_3025_ufc_fight_tracker_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.firebase.auth.ktx.auth
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.ktx.Firebase
import com.lh1137913.comp_3025_ufc_fight_tracker_app.databinding.ActivityCreateFighterBinding

class CreateFighter : AppCompatActivity() {

    private lateinit var binding : ActivityCreateFighterBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCreateFighterBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val firebaseAuth = Firebase.auth
        val firebaseDatabase = FirebaseFirestore.getInstance().collection("Fighters")

        binding.createBtn.setOnClickListener {
            val fighterId = firebaseDatabase.document().id
            val userId = firebaseAuth.currentUser!!.uid

            // All of the contents from the activity_create_fighter text fields and create a fighter object
            val name = binding.editTextTextPersonName.text.toString().trim()
            val hometown = binding.editTextTextPersonName2.text.toString().trim()
            val nickname = binding.editTextTextPersonName3.text.toString().trim()
            val record = binding.editTextTextPersonName4.text.toString().trim()
            val age = binding.editTextTextPersonName5.text.toString().trim()
            val weightClass = binding.editTextTextPersonName6.text.toString().trim()

            val fighter =
                Fighter(name, hometown, nickname, record, age, weightClass, fighterId, userId)


            firebaseDatabase.document(fighterId).set(fighter).addOnSuccessListener {
                Toast.makeText(this, "Fighter was successfully created", Toast.LENGTH_SHORT).show()
            }.addOnFailureListener {
                Toast.makeText(
                    this,
                    "Error creating your fighter, Try again later",
                    Toast.LENGTH_SHORT
                )
                    .show()
            }
        }
    }
}