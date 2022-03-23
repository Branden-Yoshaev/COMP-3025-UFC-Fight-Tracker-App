package com.lh1137913.comp_3025_ufc_fight_tracker_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Fighters4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fighters4)

        //Button 4
        val btn4 = findViewById<Button>(R.id.button4)
        btn4.setOnClickListener {
            val Intent = Intent(this,UFC271::class.java)
            startActivity(Intent)
        }
    }
}