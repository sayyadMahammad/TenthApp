package com.example.mytenthapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
//import com.microsoft.appcenter.AppCenter
//import com.microsoft.appcenter.analytics.Analytics
//import com.microsoft.appcenter.crashes.Crashes

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        AppCenter.start(
//            application, "c2a28a31-20e7-499e-a733-00ffad017161",
//            Analytics::class.java, Crashes::class.java
//        )
    }
}