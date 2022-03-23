package com.lh1137913.comp_3025_ufc_fight_tracker_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Fighters12 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fighters12)

        //Button 12
        val btn12 = findViewById<Button>(R.id.button12)
        btn12.setOnClickListener {
            val Intent = Intent(this,UFC272::class.java)
            startActivity(Intent)
        }
    }
}