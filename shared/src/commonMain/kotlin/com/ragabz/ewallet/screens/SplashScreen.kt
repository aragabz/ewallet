package com.ragabz.ewallet.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.ragabz.ewallet.Greeting

@Composable
fun SplashScreen() {
    Box(Modifier.fillMaxSize().background(color =  Color(0xFF326572))){
        Text(
            modifier = Modifier.align(Alignment.Center),
            text = Greeting().greet()
        )
    }
}



