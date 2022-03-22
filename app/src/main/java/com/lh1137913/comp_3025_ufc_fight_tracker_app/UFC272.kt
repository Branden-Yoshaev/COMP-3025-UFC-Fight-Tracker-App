package com.lh1137913.comp_3025_ufc_fight_tracker_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class UFC272 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ufc272)

        //Fighter 7
        val fighters7 = findViewById<Button>(R.id.btnfighter7)
        fighters7.setOnClickListener {
            val Intent = Intent(this,Fighters8::class.java)
            startActivity(Intent)
        }

        //Fighter 8
        val fighters8 = findViewById<Button>(R.id.btnfighter8)
        fighters8.setOnClickListener {
            val Intent = Intent(this,Fighters8::class.java)
            startActivity(Intent)
        }

        //Fighter 9
        val fighters9 = findViewById<Button>(R.id.btnfighter9)
        fighters9.setOnClickListener {
            val Intent = Intent(this,Fighters9::class.java)
            startActivity(Intent)
        }

        //Fighter 10
        val fighters10 = findViewById<Button>(R.id.btnfighter10)
        fighters10.setOnClickListener {
            val Intent = Intent(this,Fighters10::class.java)
            startActivity(Intent)
        }

        //Fighter 11
        val fighters11= findViewById<Button>(R.id.btnfighter11)
        fighters11.setOnClickListener {
            val Intent = Intent(this,Fighters11::class.java)
            startActivity(Intent)
        }

        //Fighter 12
        val fighters12 = findViewById<Button>(R.id.btnfighter12)
        fighters12.setOnClickListener {
            val Intent = Intent(this,Fighters12::class.java)
            startActivity(Intent)
        }
    }
}