package com.guntur.sehatinaja.ui.screen.login

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import com.guntur.sehatinaja.ui.navigation.Screen

@Composable
fun LoginScreen(
    navController : NavHostController,
    modifier : Modifier = Modifier
) {

    Column(
        modifier = modifier.fillMaxSize()
    ){
        Text(
            text = "LoginScreen"
        )
        Button(onClick = { navController.navigate(Screen.Home.route) }) {
            Text(text = "LOGIN")
        }
    }
}