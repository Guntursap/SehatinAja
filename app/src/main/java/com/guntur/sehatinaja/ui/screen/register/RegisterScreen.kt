package com.guntur.sehatinaja.ui.screen.register

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import com.guntur.sehatinaja.ui.navigation.Screen

@Composable
fun RegisterScreen(
    navController: NavHostController,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier.fillMaxSize()
    ){
        Text(
            text = "RegisterScreen"
        )
        Button(onClick = { navController.navigate(Screen.Login.route) }) {
            Text(text = "NEXT")
        }
    }
}