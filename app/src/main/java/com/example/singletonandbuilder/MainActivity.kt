package com.example.singletonandbuilder

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val human: Human = HumanBuilder()
            .bild()

//        val human: Human = HumanBuilder()
//            .age(100)
//            .name("????")
//            .bild()

    }
    // object - по умолчанию является Singleton
    object Manager{
        init {
            println("Initialized")
        }
    }
}