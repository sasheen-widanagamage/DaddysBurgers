package com.example.daddysburgers

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class ResetPasswordActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.reset_password)
        
        setupBackButton()
        setupConfirmPasswordButton()
    }
    
    private fun setupBackButton() {
        findViewById<ImageView>(R.id.btnBack).setOnClickListener {
            onBackPressedDispatcher.onBackPressed()
        }
    }
    
    private fun setupConfirmPasswordButton() {
        findViewById<Button>(R.id.btnConfirmPassword).setOnClickListener {
            val intent = Intent(this, ResetSuccessActivity::class.java)
            startActivity(intent)
            
            // navigate to menu
            Handler(Looper.getMainLooper()).postDelayed({
                val menuIntent = Intent(this, MenuActivity::class.java)
                startActivity(menuIntent)
                finishAffinity() // Clear the activity stack
            }, 3000)
        }
    }
}
