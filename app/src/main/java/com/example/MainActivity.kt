package com.example

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.CalendarView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.util.*

class MainActivity : AppCompatActivity() {

    companion object {
        lateinit var calendar : CalendarView
        lateinit var dateView : TextView
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        calendar = findViewById(R.id.calendar)
        dateView = findViewById(R.id.dateView)

        dateView.text = "01.01.1000"

        calendar.setOnDateChangeListener(CalendarView.OnDateChangeListener { _, year, month, day ->
            val date = day.toString() + "." + (month+1) + "."+ year
            dateView.text = date
        })


        val button = findViewById<Button>(R.id.addTrainingButton)
        button.setOnClickListener {
            val intent = Intent(this, AddTrainingActivity::class.java)
            startActivity(intent)
        }
    }
}

