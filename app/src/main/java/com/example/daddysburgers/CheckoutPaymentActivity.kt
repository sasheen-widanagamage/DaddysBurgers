package com.example.daddysburgers

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class CheckoutPaymentActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.checkout_payment)
        
        setupPaymentButtons()
        setupBackButton()
        setupBottomNavigation()
    }
    
    private fun setupPaymentButtons() {
        // Cash on Delivery tab button (button3)
        findViewById<Button>(R.id.button3).setOnClickListener {
            val intent = Intent(this, CheckoutCodActivity::class.java)
            startActivity(intent)
        }

        // Pay Now
        findViewById<Button>(R.id.btnPay).setOnClickListener {
            val intent = Intent(this, CheckoutSuccessPaymentActivity::class.java)
            startActivity(intent)
        }
    }

    private fun setupBackButton() {
        findViewById<android.widget.ImageView>(R.id.btnBack).setOnClickListener {
            onBackPressedDispatcher.onBackPressed()
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
        }
    }
}
