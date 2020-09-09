package com.example

import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SpinnnerActivity : AppCompatActivity(){

    lateinit var option : Spinner
    lateinit var result : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.create_exercise)

        option = findViewById(R.id.sp_option) as Spinner
        result = findViewById(R.id.tv_result) as TextView

        var options = arrayOf("Option 1", "Option 2", "Option 2")

        option.adapter = ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,options)


        option.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onNothingSelected(parent : AdapterView<*>?) {
                result.text = "Please Select an Option"
            }

            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                result.text = options.get(position)
            }
        }
    }

}