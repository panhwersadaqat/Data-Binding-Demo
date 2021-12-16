package com.example.databindingdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.databindingdemo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,
        R.layout.activity_main)
        binding.student = getStudent()
    }

    private fun getStudent(): Student {
        return Student(1,"Sadaqat Panhwer", "sadaqatpanhwer.appiskey@gmail.com")
    }
}