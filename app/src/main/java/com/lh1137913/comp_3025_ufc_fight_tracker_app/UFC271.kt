package com.lh1137913.comp_3025_ufc_fight_tracker_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class UFC271 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ufc271)

        //Fighter 1
        val fighters1 = findViewById<Button>(R.id.btnfighter1)
        fighters1.setOnClickListener {
            val Intent = Intent(this,Fighters1::class.java)
            startActivity(Intent)
        }

        //Fighter 2
        val fighters2 = findViewById<Button>(R.id.btnfighter2)
        fighters2.setOnClickListener {
            val Intent = Intent(this,Fighters2::class.java)
            startActivity(Intent)
        }

        //Fighter 3
        val fighters3 = findViewById<Button>(R.id.btnfighter3)
        fighters3.setOnClickListener {
            val Intent = Intent(this,Fighters3::class.java)
            startActivity(Intent)
        }

        //Fighter 4
        val fighters4 = findViewById<Button>(R.id.btnfighter4)
        fighters4.setOnClickListener {
            val Intent = Intent(this,Fighters4::class.java)
            startActivity(Intent)
        }

        //Fighter 5
        val fighters5 = findViewById<Button>(R.id.btnfighter5)
        fighters5.setOnClickListener {
            val Intent = Intent(this,Fighters5::class.java)
            startActivity(Intent)
        }

        //Fighter 6
        val fighters6 = findViewById<Button>(R.id.btnfighter6)
        fighters6.setOnClickListener {
            val Intent = Intent(this,Fighters6::class.java)
            startActivity(Intent)
        }
    }
}