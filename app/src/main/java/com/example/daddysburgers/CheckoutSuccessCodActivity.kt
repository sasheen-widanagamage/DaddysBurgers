package com.example.daddysburgers

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class CheckoutSuccessCodActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.checkout_success_cod)
        
        setupSuccessButtons()
    }
    
    private fun setupSuccessButtons() {
        // Track Order
        findViewById<Button>(R.id.btnTrackOrder).setOnClickListener {
            val intent = Intent(this, TrackOrderActivity::class.java)
            startActivity(intent)
        }
        
        // Continue Ordering
        findViewById<Button>(R.id.btnContinueOrdering).setOnClickListener {
            val intent = Intent(this, MenuActivity::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_NEW_TASK
            startActivity(intent)
            finish()
        }
    }
}
