package com.lh1137913.comp_3025_ufc_fight_tracker_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Fighters8 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fighters8)

        //Button 8
        val btn8 = findViewById<Button>(R.id.button8)
        btn8.setOnClickListener {
            val Intent = Intent(this,UFC272::class.java)
            startActivity(Intent)
        }
    }
}