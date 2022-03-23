package com.lh1137913.comp_3025_ufc_fight_tracker_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Fighters13 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fighters13)

        //Button 13
        val btn13 = findViewById<Button>(R.id.button13)
        btn13.setOnClickListener {
            val Intent = Intent(this,UFC273::class.java)
            startActivity(Intent)
        }
    }
}