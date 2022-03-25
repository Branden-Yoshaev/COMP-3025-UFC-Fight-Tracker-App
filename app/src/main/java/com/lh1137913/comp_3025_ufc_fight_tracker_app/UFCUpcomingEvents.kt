package com.lh1137913.comp_3025_ufc_fight_tracker_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.FirebaseFirestore
import com.squareup.okhttp.Dispatcher
import java.lang.Exception

class UFCUpcomingEvents : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ufcupcoming_events)

        //Fighter 1
        val btn1 = findViewById<Button>(R.id.btnAdesanya);

        btn1.setOnClickListener {
            Toast.makeText(this, "Button Clicked",Toast.LENGTH_SHORT).show()
        }

        val uFCUpcomingEvents = findViewById<Button>(R.id.btnAdesanya)
        uFCUpcomingEvents.setOnClickListener {
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

        val uFCUpcomingEvents271 = findViewById<Button>(R.id.btn271)
        uFCUpcomingEvents271.setOnClickListener {
            val Intent = Intent(this,UFC271::class.java)
            startActivity(Intent)
        }

        //Fighter 7
        val btn7 = findViewById<Button>(R.id.btnCovington);

        btn7.setOnClickListener {
            Toast.makeText(this, "Button Clicked",Toast.LENGTH_SHORT).show()
        }

        val uFCUpcomingEvents7 = findViewById<Button>(R.id.btnCovington)
        uFCUpcomingEvents7.setOnClickListener {
            //Read data from firebase

            //open new window passing the object from firebase
            val intent = Intent(this,Fighters7::class.java)
            startActivity(intent)
        }

        //Fighter 8
        val btn8 = findViewById<Button>(R.id.btnMasvidal);

        btn8.setOnClickListener {
            Toast.makeText(this, "Button Clicked",Toast.LENGTH_SHORT).show()
        }

        val uFCUpcomingEvents8 = findViewById<Button>(R.id.btnMasvidal)
        uFCUpcomingEvents8.setOnClickListener {
            val Intent = Intent(this,Fighters8::class.java)
            startActivity(Intent)
        }

        //Event 272
        val btn272 = findViewById<Button>(R.id.btn272);

        btn272.setOnClickListener {
            Toast.makeText(this, "Button Clicked",Toast.LENGTH_SHORT).show()
        }

        val uFCUpcomingEvents272 = findViewById<Button>(R.id.btn272)
        uFCUpcomingEvents272.setOnClickListener {
            val Intent = Intent(this,UFC272::class.java)
            startActivity(Intent)
        }

        //Fighter 13
        val btn13 = findViewById<Button>(R.id.btnVolkanovski);

        btn13.setOnClickListener {
            Toast.makeText(this, "Button Clicked",Toast.LENGTH_SHORT).show()
        }

        val uFCUpcomingEvents13 = findViewById<Button>(R.id.btnVolkanovski)
        uFCUpcomingEvents13.setOnClickListener {
            val Intent = Intent(this,Fighters13::class.java)
            startActivity(Intent)
        }

        //Fighter 14
        val btn14 = findViewById<Button>(R.id.btnSungJung);

        btn14.setOnClickListener {
            Toast.makeText(this, "Button Clicked",Toast.LENGTH_SHORT).show()
        }

        val uFCUpcomingEvents14= findViewById<Button>(R.id.btnSungJung)
        uFCUpcomingEvents14.setOnClickListener {
            val Intent = Intent(this,Fighters14::class.java)
            startActivity(Intent)
        }

        //Event 273
        val btn273 = findViewById<Button>(R.id.btn273);

        btn273.setOnClickListener {
            Toast.makeText(this, "Button Clicked",Toast.LENGTH_SHORT).show()
        }

        val uFCUpcomingEvents273 = findViewById<Button>(R.id.btn273)
        uFCUpcomingEvents273.setOnClickListener {
            val Intent = Intent(this,UFC273::class.java)
            startActivity(Intent)
        }
    }
}