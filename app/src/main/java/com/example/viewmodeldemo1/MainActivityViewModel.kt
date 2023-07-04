package com.example.viewmodeldemo1

import androidx.lifecycle.ViewModel

class MainActivityViewModel: ViewModel()
{
    var count:Int=0

    fun getCountValue():Int{
        return count
    }

    fun sumOfTheValue(input:Int){
        count +=input
    }
}