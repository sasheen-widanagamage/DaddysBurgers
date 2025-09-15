package com.example.daddysburgers

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class CheckoutLocationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.checkout_location)
        
        setupLocationButtons()
        setupBackButton()
    }
    
    private fun setupLocationButtons() {
        // Use this location
        findViewById<Button>(R.id.btnUseThisLocation).setOnClickListener {
            val intent = Intent(this, CheckoutPhoneActivity::class.java)
            startActivity(intent)
        }
    }

    private fun setupBackButton() {
        findViewById<android.widget.ImageView>(R.id.btnBack).setOnClickListener {
            onBackPressedDispatcher.onBackPressed()
        }
    }
}
