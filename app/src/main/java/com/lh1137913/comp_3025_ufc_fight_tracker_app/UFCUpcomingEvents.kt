package com.lh1137913.comp_3025_ufc_fight_tracker_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

class UFCUpcomingEvents : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ufcupcoming_events)

        //Fighter 1
        val btn1 = findViewById<Button>(R.id.btnAdesanya);

        btn1.setOnClickListener {
            Toast.makeText(this, "Button Clicked",Toast.LENGTH_SHORT).show()
        }

        val UFCUpcomingEvents = findViewById<Button>(R.id.btnAdesanya)
        UFCUpcomingEvents.setOnClickListener {
            val Intent = Intent(this,Fighters1::class.java)
            startActivity(Intent)
        }

        //Fighter 2
        val btn2 = findViewById<Button>(R.id.btnWhittaker);

        btn2.setOnClickListener {
            Toast.makeText(this, "Button Clicked",Toast.LENGTH_SHORT).show()
        }

        val UFCUpcomingEvents2 = findViewById<Button>(R.id.btnWhittaker)
        UFCUpcomingEvents2.setOnClickListener {
            val Intent = Intent(this,Fighters2::class.java)
            startActivity(Intent)
        }

        //Event 271
        val btn271 = findViewById<Button>(R.id.btn271);

        btn271.setOnClickListener {
            Toast.makeText(this, "Button Clicked",Toast.LENGTH_SHORT).show()
        }

        val UFCUpcomingEvents271 = findViewById<Button>(R.id.btn271)
        UFCUpcomingEvents271.setOnClickListener {
            val Intent = Intent(this,UFC271::class.java)
            startActivity(Intent)
        }

        //Fighter 3
        val btn3 = findViewById<Button>(R.id.btnCovington);

        btn3.setOnClickListener {
            Toast.makeText(this, "Button Clicked",Toast.LENGTH_SHORT).show()
        }

        val UFCUpcomingEvents3 = findViewById<Button>(R.id.btnCovington)
        UFCUpcomingEvents3.setOnClickListener {
            val Intent = Intent(this,Fighters3::class.java)
            startActivity(Intent)
        }

        //Fighter 4
        val btn4 = findViewById<Button>(R.id.btnMasvidal);

        btn4.setOnClickListener {
            Toast.makeText(this, "Button Clicked",Toast.LENGTH_SHORT).show()
        }

        val UFCUpcomingEvents4 = findViewById<Button>(R.id.btnMasvidal)
        UFCUpcomingEvents4.setOnClickListener {
            val Intent = Intent(this,Fighters4::class.java)
            startActivity(Intent)
        }

        //Event 272
        val btn272 = findViewById<Button>(R.id.btn272);

        btn272.setOnClickListener {
            Toast.makeText(this, "Button Clicked",Toast.LENGTH_SHORT).show()
        }

        val UFCUpcomingEvents272 = findViewById<Button>(R.id.btn272)
        UFCUpcomingEvents272.setOnClickListener {
            val Intent = Intent(this,UFC272::class.java)
            startActivity(Intent)
        }

        //Fighter 5
        val btn5 = findViewById<Button>(R.id.btnVolkanovski);

        btn5.setOnClickListener {
            Toast.makeText(this, "Button Clicked",Toast.LENGTH_SHORT).show()
        }

        val UFCUpcomingEvents5 = findViewById<Button>(R.id.btnVolkanovski)
        UFCUpcomingEvents5.setOnClickListener {
            val Intent = Intent(this,Fighters5::class.java)
            startActivity(Intent)
        }

        //Fighter 6
        val btn6 = findViewById<Button>(R.id.btnSungJung);

        btn6.setOnClickListener {
            Toast.makeText(this, "Button Clicked",Toast.LENGTH_SHORT).show()
        }

        val UFCUpcomingEvents6 = findViewById<Button>(R.id.btnSungJung)
        UFCUpcomingEvents6.setOnClickListener {
            val Intent = Intent(this,Fighters6::class.java)
            startActivity(Intent)
        }

        //Event 273
        val btn273 = findViewById<Button>(R.id.btn273);

        btn273.setOnClickListener {
            Toast.makeText(this, "Button Clicked",Toast.LENGTH_SHORT).show()
        }

        val UFCUpcomingEvents273 = findViewById<Button>(R.id.btn273)
        UFCUpcomingEvents273.setOnClickListener {
            val Intent = Intent(this,UFC273::class.java)
            startActivity(Intent)
        }
    }
}