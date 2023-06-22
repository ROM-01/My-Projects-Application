package com.example.testingapp

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider

//PEOPLE COUNTER

class ClickCount : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    //the onCreate function is a method because it's within a class
    private lateinit var viewModel:ClickCountViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.click_count)
        viewModel = ViewModelProvider(this).get(ClickCountViewModel::class.java)
        val countClick = findViewById<Button>(R.id.btnCount)
        val viewCount = findViewById<TextView>(R.id.countTxt)
        val greet = findViewById<TextView>(R.id.txtView)
        val page1 = findViewById<Button>(R.id.buttonPage1)


        var timesClicked = 0
        viewCount.text = viewModel.count.toString()

        countClick.setOnClickListener {
            greet.text = "Counting..."
            //timesClicked += 1
            //viewCount.text = timesClicked.toString()
            viewModel.updateCount()
            viewCount.text = viewModel.count.toString()

            //	• The toast function basically allows you to display something on the screen for a short or long period. It's like a notification or prompt:
            Toast.makeText(this, "Good job!", Toast.LENGTH_LONG).show()
        }

        page1.setOnClickListener {
            val intent = Intent(this, AgeInActivity::class.java)
            startActivity(intent)
        }
    }
}