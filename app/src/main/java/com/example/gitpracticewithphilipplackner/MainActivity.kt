package com.example.gitpracticewithphilipplackner

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        println("THIS is 2nd commit")

        today is good day //to learn how  to "undo" if we fuck the things i.e revert
    }
}