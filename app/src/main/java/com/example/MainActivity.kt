package com.example

import android.content.Intent
import android.os.Bundle
import android.util.Log.d
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.content_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(findViewById(R.id.toolbar))


        fab.setOnClickListener {
            startActivity(Intent(this, AddProductActivity::class.java))
        }

        val products = listOf("Building", "Car","Truck","Ubuntu Laptop","MacBookPro","Google Home")

        products.forEach {
            d("anette","Product is $it")
            productsTextView.append(it)
        }


    //     val preferences = getSharedPreferences("database", Context.MODE_PRIVATE)
    //     val savedName =  preferences.getString("savedProductName", "This value doesn't exist. ")
    //     d("Anette","saved message is: $savedName")
    //        lastSavedProduct.text = savedName

    // The website we'll go to is: https://finepointmobile.com/api/inventory/v1/message


    }
}