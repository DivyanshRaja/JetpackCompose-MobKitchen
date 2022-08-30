package com.mobcoder.mob_kitchen_jetpack.navigation

sealed class Screen(val route: String) {
    object Splash : Screen("splash_screen")
    object Login : Screen("login_screen")
    object Home : Screen("home_screen")
    object MobMenu : Screen("mob_menuFood_screen")
}