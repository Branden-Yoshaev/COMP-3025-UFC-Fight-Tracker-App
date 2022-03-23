package com.lh1137913.comp_3025_ufc_fight_tracker_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Fighters10 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fighters10)

        //Button 10
        val btn10 = findViewById<Button>(R.id.button10)
        btn10.setOnClickListener {
            val Intent = Intent(this,UFC272::class.java)
            startActivity(Intent)
        }
    }
}