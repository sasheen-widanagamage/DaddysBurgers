package com.example.daddysburgers

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.ImageButton
import android.util.Log

class Onboarding1Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.onboarding1)

        try {
            // next
            val nextButton1: ImageButton = findViewById(R.id.imageButton)
            Log.d("Onboarding1Activity", "Found imageButton")
            nextButton1.setOnClickListener {
                try {
                    val intent = Intent(this, Onboarding2Activity::class.java)
                    startActivity(intent)
                } catch (e: Exception) {
                    Log.e("Onboarding1Activity", "Error starting Onboarding2Activity: ${e.message}")
                }
            }
        } catch (e: Exception) {
            Log.e("Onboarding1Activity", "Error setting up click listener: ${e.message}")
            e.printStackTrace()
        }
    }
}