package com.lh1137913.comp_3025_ufc_fight_tracker_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

class UFCUpcomingEvents : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ufcupcoming_events)

        val btn1 = findViewById<Button>(R.id.btnAdesanya);

        btn1.setOnClickListener {
            Toast.makeText(this, "Button Clicked",Toast.LENGTH_SHORT).show()
        }

        val btn2 = findViewById<Button>(R.id.btnWhittaker);

        btn2.setOnClickListener {
            Toast.makeText(this, "Button Clicked",Toast.LENGTH_SHORT).show()
        }

        val btn3 = findViewById<Button>(R.id.btn271);

        btn3.setOnClickListener {
            Toast.makeText(this, "Button Clicked",Toast.LENGTH_SHORT).show()
        }

        val btn4 = findViewById<Button>(R.id.btnCovington);

        btn4.setOnClickListener {
            Toast.makeText(this, "Button Clicked",Toast.LENGTH_SHORT).show()
        }

        val btn5 = findViewById<Button>(R.id.btnMasvidal);

        btn5.setOnClickListener {
            Toast.makeText(this, "Button Clicked",Toast.LENGTH_SHORT).show()
        }

        val btn6 = findViewById<Button>(R.id.btn272);

        btn6.setOnClickListener {
            Toast.makeText(this, "Button Clicked",Toast.LENGTH_SHORT).show()
        }

        val btn7 = findViewById<Button>(R.id.btnVolkanovski);

        btn7.setOnClickListener {
            Toast.makeText(this, "Button Clicked",Toast.LENGTH_SHORT).show()
        }

        val btn8 = findViewById<Button>(R.id.btnSungJung);

        btn8.setOnClickListener {
            Toast.makeText(this, "Button Clicked",Toast.LENGTH_SHORT).show()
        }

        val btn9 = findViewById<Button>(R.id.btn273);

        btn9.setOnClickListener {
            Toast.makeText(this, "Button Clicked",Toast.LENGTH_SHORT).show()
        }
    }
}