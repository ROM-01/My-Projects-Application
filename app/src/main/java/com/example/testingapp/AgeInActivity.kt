package com.example.testingapp

import android.app.DatePickerDialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import java.text.SimpleDateFormat
import java.util.Calendar
import java.util.Locale

class AgeInActivity : AppCompatActivity() {

    private var tvSelectedDate: TextView? = null
    private var tvAgeInMinutes: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_age_in)

        val btnDatePick: Button = findViewById(R.id.btnDatePick)
        val page2: Button = findViewById(R.id.buttonPage2)
        val backPage: Button = findViewById(R.id.buttonPage3)
        tvSelectedDate = findViewById(R.id.tvSelectedDate)
        tvAgeInMinutes = findViewById(R.id.tvAgeInMinutes)


        btnDatePick.setOnClickListener {
            clickDatePicker()
        }

        page2.setOnClickListener(){
            var intent = Intent(this, MyCalculator::class.java)
            startActivity(intent)
        }

        backPage.setOnClickListener(){
            var intent = Intent(this, ClickCount::class.java)
            startActivity(intent)
        }
    }

    private fun clickDatePicker() {

        val myCalendar = Calendar.getInstance()
        val year = myCalendar.get(Calendar.YEAR)
        val month = myCalendar.get(Calendar.MONTH)
        val day = myCalendar.get(Calendar.DAY_OF_MONTH)
        val dpd = DatePickerDialog(
            this,
            { _, selectedYear, selectedMonth, selectedDayOfMonth ->

                Toast.makeText(
                    this,
                    "You selected $selectedYear , ${selectedMonth + 1}"
                            + " , $selectedDayOfMonth",
                    Toast.LENGTH_LONG
                ).show()

                val selectedDate = "$selectedDayOfMonth/${selectedMonth + 1}/$selectedYear"

                tvSelectedDate?.text = selectedDate

                val sdf = SimpleDateFormat("MM/dd/yyyy", Locale.ENGLISH)

                val theDate = sdf.parse(selectedDate)
                theDate?.let {
                    val selectedDateInMinutes = theDate.time / 60000

                    val currentDate = sdf.parse(sdf.format(System.currentTimeMillis()))
                    currentDate?.let {
                        val currentDateInMinutes = currentDate.time / 60000

                        val differenceInMinutes = currentDateInMinutes - selectedDateInMinutes

                        tvAgeInMinutes?.text = differenceInMinutes.toString()


                    }

                }

            },
            year,
            month,
            day
        )

        dpd.datePicker.maxDate = System.currentTimeMillis() - 86400000
        dpd.show()



    }

}

