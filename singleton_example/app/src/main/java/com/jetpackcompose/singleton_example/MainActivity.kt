package com.jetpackcompose.singleton_example

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.jetpackcompose.singleton_example.Retrofit.Rest

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mRest = Rest
        val rest = mRest.getInstance()
        println("rest:${rest.retrofit}")

        val mRest2 = Rest
        val rest2 = mRest2.getInstance()
        println("rest2:${rest2.retrofit}")

        val mRest3 = Rest
        val rest3 = mRest3.getInstance()
        println("rest3:${rest3.retrofit}")
    }
}