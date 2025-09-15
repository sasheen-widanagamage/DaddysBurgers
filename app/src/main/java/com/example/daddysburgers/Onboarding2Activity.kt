package com.example.daddysburgers

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.ImageButton
import android.util.Log

class Onboarding2Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.onboarding2)

        try {
            // next
            val nextButton2: ImageButton = findViewById(R.id.imageButton4)
            nextButton2.setOnClickListener {
                val intent = Intent(this, Onboarding3Activity::class.java)
                startActivity(intent)
            }
        } catch (e: Exception) {
            Log.e("Onboarding2Activity", "Error setting up click listener: ${e.message}")
        }
    }
}