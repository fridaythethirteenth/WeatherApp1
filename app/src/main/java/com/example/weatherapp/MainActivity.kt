package com.example.weatherapp

import android.os.Bundle
import android.os.PersistableBundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.weatherapp.ui.CurrentConditions

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        setContent {
            val navController = rememberNavController()
            NavHost(navController, startDestination = "CurrentConditions" ) {
                composable("CurrentConditions") {
                    CurrentConditions()
                }
            }
        }
    }
}