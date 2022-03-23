package com.lh1137913.comp_3025_ufc_fight_tracker_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Fighters1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fighters1)

        //Button 1
        val btn1 = findViewById<Button>(R.id.button1)
        btn1.setOnClickListener {
            val Intent = Intent(this,UFC271::class.java)
            startActivity(Intent)
        }
    }
}