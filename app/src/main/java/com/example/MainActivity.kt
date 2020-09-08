package com.example

import android.content.Intent
import android.os.Bundle
import android.util.Log.d
import android.widget.Button
import android.widget.CalendarView
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.content_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        val calendar = findViewById<CalendarView>(R.id.calendarView)
        val selectedDate = calendar.getDate()

        d("anette", selectedDate.toString())

        val button = findViewById<Button>(R.id.addTrainingButton)
        button.setOnClickListener {
            val intent = Intent(this, AddTrainingActivity::class.java)
            startActivity(intent)
        }
    }
}

