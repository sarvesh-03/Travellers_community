package com.example.travellerscommunity.ui.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.travellerscommunity.R

//This activity is host for remaining fragments
class DashboardActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)
    }
}