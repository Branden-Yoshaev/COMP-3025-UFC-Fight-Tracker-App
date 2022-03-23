package com.lh1137913.comp_3025_ufc_fight_tracker_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class UFC273 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ufc273)

        //Fighter 13
        val fighters13 = findViewById<Button>(R.id.btnfighter13)
        fighters13.setOnClickListener {
            val Intent = Intent(this,Fighters13::class.java)
            startActivity(Intent)
        }

        //Fighter 14
        val fighters14 = findViewById<Button>(R.id.btnfighter14)
        fighters14.setOnClickListener {
            val Intent = Intent(this,Fighters14::class.java)
            startActivity(Intent)
        }

        //Fighter 15
        val fighters15 = findViewById<Button>(R.id.btnfighter15)
        fighters15.setOnClickListener {
            val Intent = Intent(this,Fighters15::class.java)
            startActivity(Intent)
        }

        //Fighter 16
        val fighters16 = findViewById<Button>(R.id.btnfighter16)
        fighters16.setOnClickListener {
            val Intent = Intent(this,Fighters16::class.java)
            startActivity(Intent)
        }

        //Fighter 17
        val fighters17= findViewById<Button>(R.id.btnfighter17)
        fighters17.setOnClickListener {
            val Intent = Intent(this,Fighters17::class.java)
            startActivity(Intent)
        }

        //Fighter 18
        val fighters18 = findViewById<Button>(R.id.btnfighter18)
        fighters18.setOnClickListener {
            val Intent = Intent(this,Fighters18::class.java)
            startActivity(Intent)
        }

        //Back Button 3
        val backBtn3 = findViewById<Button>(R.id.backBtn3)
        backBtn3.setOnClickListener {
            val Intent = Intent(this,UFCUpcomingEvents::class.java)
            startActivity(Intent)
        }
    }
}