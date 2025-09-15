package com.example.daddysburgers

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity
import android.util.Log

class LaunchActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        try {
            Log.d("LaunchActivity", "onCreate started")
            setContentView(R.layout.launch_screen)
            Log.d("LaunchActivity", "Layout loaded successfully")
            
            // Test with a simple delay first
            Handler(Looper.getMainLooper()).postDelayed({
                Log.d("LaunchActivity", "3 seconds passed")
                try {
                    Log.d("LaunchActivity", "Starting Onboarding1Activity")
                    val intent = Intent(this, Onboarding1Activity::class.java)
                    startActivity(intent)
                    finish()
                } catch (e: Exception) {
                    Log.e("LaunchActivity", "Error starting Onboarding1Activity: ${e.message}")
                    e.printStackTrace()
                }
            }, 3000)
        } catch (e: Exception) {
            Log.e("LaunchActivity", "Error in onCreate: ${e.message}")
            e.printStackTrace()
        }
    }
}