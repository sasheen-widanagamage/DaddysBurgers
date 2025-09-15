package com.example.daddysburgers

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class CheckoutCodActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.checkout_cod)
        
        setupConfirmOrder()
        setupTabs()
        setupBackButton()
        setupBottomNavigation()
    }
    
    private fun setupConfirmOrder() {
        val placeOrder = findViewById<Button>(R.id.btnPlaceOrder)
        placeOrder?.setOnClickListener {
            val intent = Intent(this, CheckoutSuccessCodActivity::class.java)
            startActivity(intent)
        }
    }

    private fun setupTabs() {
        val cardTab = findViewById<Button>(R.id.button2)
        cardTab?.setOnClickListener {
            val intent = Intent(this, CheckoutPaymentActivity::class.java)
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
        
        //  menu
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
