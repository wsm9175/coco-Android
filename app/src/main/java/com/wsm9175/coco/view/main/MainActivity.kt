package com.wsm9175.coco.view.main

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.wsm9175.coco.R
import com.wsm9175.coco.databinding.ActivityIntroBinding
import com.wsm9175.coco.databinding.ActivityMainBinding
import com.wsm9175.coco.view.setting.SettingActivity
import timber.log.Timber

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.setting.setOnClickListener {
            startActivity(Intent(this, SettingActivity::class.java))
        }

        val bottomNavigation = binding.bottomNavigation
        val navHostFragment = supportFragmentManager.findFragmentById(R.id.fragmentContainerView2) as NavHostFragment
        val navController = navHostFragment.navController
        bottomNavigation.setupWithNavController(navController)

    }
}