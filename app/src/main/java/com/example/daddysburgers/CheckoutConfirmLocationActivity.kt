package com.example.daddysburgers

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class CheckoutConfirmLocationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.checkout_confirm_location)
        
        setupConfirmLocation()
        setupBack()
    }
    
    private fun setupConfirmLocation() {
        findViewById<Button>(R.id.btnConfirmloc).setOnClickListener {
            val intent = Intent(this, CheckoutLocationActivity::class.java)
            startActivity(intent)
        }
    }

    private fun setupBack() {
        findViewById<android.widget.ImageView>(R.id.btnBack).setOnClickListener {
            onBackPressedDispatcher.onBackPressed()
        }
    }
}
