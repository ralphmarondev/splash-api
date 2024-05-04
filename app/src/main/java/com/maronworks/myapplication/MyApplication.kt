package com.maronworks.myapplication

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.maronworks.myapplication.home.HomeScreen
import com.maronworks.myapplication.ui.theme.MyApplicationTheme

@Composable
fun MyApplication(modifier: Modifier = Modifier) {
    MyApplicationTheme {
        Surface(
            modifier = Modifier
                .fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ) {
            HomeScreen()
        }
    }
}