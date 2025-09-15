package com.example.daddysburgers

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class OrderDetailsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.orderdetails)
        
        setupBackButton()
        setupActionButtons()
        setupBottomNavigation()
    }
    
    private fun setupBackButton() {
        findViewById<View>(R.id.btnBack).setOnClickListener {
            onBackPressedDispatcher.onBackPressed()
        }
    }
    
    private fun setupActionButtons() {
        // Track Order
        findViewById<Button>(R.id.btnTrackOrder).setOnClickListener {
            val intent = Intent(this, TrackOrderActivity::class.java)
            startActivity(intent)
        }
        
        // Order Again
        findViewById<Button>(R.id.btnOrderAgain).setOnClickListener {
            val intent = Intent(this, CartActivity::class.java)
            startActivity(intent)
        }
    }
    
    private fun setupBottomNavigation() {
        // Cart
        findViewById<View>(R.id.navCart).setOnClickListener {
            val intent = Intent(this, CartActivity::class.java)
            startActivity(intent)
        }
        
        // menu
        findViewById<View>(R.id.navHome).setOnClickListener {
            val intent = Intent(this, MenuActivity::class.java)
            startActivity(intent)
            finish()
        }
        
        // Profile
        findViewById<View>(R.id.navProfile).setOnClickListener {
            val intent = Intent(this, ProfileActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}
