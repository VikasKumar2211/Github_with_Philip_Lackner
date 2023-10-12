package com.example.gitpracticewithphilipplackner

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        println("THIS is 2nd commit")
            println("LOCAL CHANGE")
    }
}