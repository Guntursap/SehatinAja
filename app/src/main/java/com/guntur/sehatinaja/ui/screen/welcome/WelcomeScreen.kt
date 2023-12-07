package com.guntur.sehatinaja.ui.screen.welcome

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import com.guntur.sehatinaja.ui.navigation.Screen

@Composable
fun WelcomeScreen(
    navHostController: NavHostController,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier.fillMaxSize()
    ){
        Text(
            text = "WelcomeScreen"
        )
        Button(onClick = { navHostController.navigate(Screen.Login.route) }) {
            Text(text = "LOGIN")
        }
        Button(onClick = { navHostController.navigate(Screen.Register.route )}) {
            Text(text = "REGISTER")
        }
    }
}

