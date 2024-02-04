package com.ragabz.ewallet

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import com.ragabz.ewallet.screens.SplashScreen

@Composable
fun App() {
    MaterialTheme {
        Scaffold {
            SplashScreen()
        }
    }
}