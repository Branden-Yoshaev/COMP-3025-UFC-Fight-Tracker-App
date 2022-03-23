package com.lh1137913.comp_3025_ufc_fight_tracker_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Fighters17 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fighters17)

        //Button 17
        val btn17 = findViewById<Button>(R.id.button17)
        btn17.setOnClickListener {
            val Intent = Intent(this,UFC273::class.java)
            startActivity(Intent)
        }
    }
}