package com.guntur.sehatinaja.ui.navigation

sealed class Screen(val route: String) {
    object Welcome: Screen("welcome")
    object Login: Screen("login")
    object Register: Screen("register")
    object Home: Screen("home")
    object History: Screen("history")
    object Profile: Screen("profile")
}