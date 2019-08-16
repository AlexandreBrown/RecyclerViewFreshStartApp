package com.example.freshstart.views

import android.os.Bundle
import com.example.freshstart.R

class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        addFragments()
    }

    private fun addFragments() {

        val mainFragment = (supportFragmentManager.findFragmentById(R.id.mainContent) as? MainFragment) ?: MainFragment()
        supportFragmentManager.beginTransaction().replace(R.id.mainContent, mainFragment).commit()
    }
}