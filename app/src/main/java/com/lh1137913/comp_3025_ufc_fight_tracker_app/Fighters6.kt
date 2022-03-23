package com.lh1137913.comp_3025_ufc_fight_tracker_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Fighters6 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fighters6)

        //Button 6
        val btn6 = findViewById<Button>(R.id.button6)
        btn6.setOnClickListener {
            val Intent = Intent(this,UFC271::class.java)
            startActivity(Intent)
        }
    }
}