package com.example.viewmodeldemo1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.viewmodeldemo1.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var countClass:MainActivityViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        countClass = ViewModelProvider(this)[MainActivityViewModel::class.java]
         
            binding.click.setOnClickListener {
               //  val number =
                countClass.sumOfTheValue( binding.enterNumber.text.toString().toInt())
                 binding.sum.text = countClass.getCountValue().toString()
             }




    }
}