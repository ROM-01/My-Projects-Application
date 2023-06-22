package com.example.testingapp

import androidx.lifecycle.ViewModel

class ClickCountViewModel : ViewModel() {
    var count = 0

    fun updateCount(){
        ++count
    }
}