package com.example

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.add_training.*

class AddTrainingActivity: AppCompatActivity() {

    lateinit var date : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.add_training)

        date = findViewById(R.id.date)
        date.text = MainActivity.dateView.text

        val button = findViewById<Button>(R.id.AddTrainingSubmitButton)
        button.setOnClickListener {
            val intent = Intent(this,SpinnnerActivity::class.java)
            startActivity(intent)
        }

    }
}