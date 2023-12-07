package com.guntur.sehatinaja.ui

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.guntur.sehatinaja.ui.component.BottomBar
import com.guntur.sehatinaja.ui.navigation.Screen
import com.guntur.sehatinaja.ui.screen.history.HistoryScreen
import com.guntur.sehatinaja.ui.screen.home.HomeScreen
import com.guntur.sehatinaja.ui.screen.login.LoginScreen
import com.guntur.sehatinaja.ui.screen.profile.ProfileScreen
import com.guntur.sehatinaja.ui.screen.register.RegisterScreen
import com.guntur.sehatinaja.ui.screen.welcome.WelcomeScreen

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SehatinAjaApp(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController()
) {
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentRoute = navBackStackEntry?.destination?.route
    Scaffold(
        modifier = modifier,
        bottomBar = {
            if (currentRoute !in listOf(
                    Screen.Login.route, Screen.Register.route, Screen.Welcome.route)
                ){
                BottomBar(navController = navController)
            }
        },
    ) { innerPadding ->
        NavHost(
            navController = navController,
            startDestination = Screen.Welcome.route,
            modifier = modifier.padding(innerPadding)
        ) {
            composable(Screen.Welcome.route) {
                WelcomeScreen(navHostController = navController)
            }
            composable(Screen.Login.route) {
                LoginScreen(navController = navController)
            }
            composable(Screen.Register.route) {
                RegisterScreen(navController = navController)
            }
            composable(Screen.Home.route) {
                HomeScreen()
            }
            composable(Screen.History.route) {
                HistoryScreen()
            }
            composable(Screen.Profile.route) {
                ProfileScreen()
            }
        }
    }
}