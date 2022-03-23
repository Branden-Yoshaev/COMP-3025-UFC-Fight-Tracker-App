package com.lh1137913.comp_3025_ufc_fight_tracker_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Fighters15 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fighters15)

        //Button 15
        val btn15 = findViewById<Button>(R.id.button15)
        btn15.setOnClickListener {
            val Intent = Intent(this,UFC273::class.java)
            startActivity(Intent)
        }
    }
}