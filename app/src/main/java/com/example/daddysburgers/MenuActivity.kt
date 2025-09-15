package com.example.daddysburgers

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import android.widget.ScrollView

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.menu)
        
        setupNavigation()
        setupTabScrolling()
        setupBottomNavigation()
    }
    
    private fun setupNavigation() {

        findViewById<ImageView>(R.id.btnBack).setOnClickListener {
            onBackPressedDispatcher.onBackPressed()
        }
        
        // Customize banner navigation
        findViewById<View>(R.id.customizeBanner).setOnClickListener {
            val intent = Intent(this, BurgerCustomActivity::class.java)
            startActivity(intent)
        }
    }
    
    private fun setupTabScrolling() {
        val scrollView = findViewById<ScrollView>(R.id.menuScrollView)
        
        // Tab Burgers
        findViewById<Button>(R.id.tabBurgers).setOnClickListener {
            val targetView = findViewById<View>(R.id.burgerlay)
            scrollToView(scrollView, targetView)
        }
        
        // Tab Combos
        findViewById<Button>(R.id.tabCombos).setOnClickListener {
            val targetView = findViewById<View>(R.id.combolay)
            scrollToView(scrollView, targetView)
        }
        
        // Tab Sides
        findViewById<Button>(R.id.tabSides).setOnClickListener {
            val targetView = findViewById<View>(R.id.sidelay)
            scrollToView(scrollView, targetView)
        }
        
        // Tab Drinks
        findViewById<Button>(R.id.tabDrinks).setOnClickListener {
            val targetView = findViewById<View>(R.id.drinkslay)
            scrollToView(scrollView, targetView)
        }

        // Tab Desserts
        findViewById<Button>(R.id.tabDesserts).setOnClickListener {
            val targetView = findViewById<View>(R.id.dessertslay)
            scrollToView(scrollView, targetView)
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

        }
        
        // Profile
        findViewById<View>(R.id.navProfile).setOnClickListener {
            val intent = Intent(this, ProfileActivity::class.java)
            startActivity(intent)
        }
    }
    
    private fun scrollToView(scrollView: ScrollView, targetView: View) {
        scrollView.post {
            scrollView.smoothScrollTo(0, targetView.top)
        }
    }
}
