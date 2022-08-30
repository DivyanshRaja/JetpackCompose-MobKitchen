package com.mobcoder.mob_kitchen_jetpack.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.mobcoder.mob_kitchen_jetpack.SplashScreen
import com.mobcoder.mob_kitchen_jetpack.auth.LoginScreen
import com.mobcoder.mob_kitchen_jetpack.home.HomeScreen
import com.mobcoder.mob_kitchen_jetpack.home.MobFoodMenuScreen

@Composable
fun SetupNavGraph() {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = Screen.Splash.route
    ) {
        composable(route = Screen.Splash.route) {
            SplashScreen(navController = navController)

        }
        composable(route = Screen.Login.route) {
            LoginScreen(navController = navController)
        }

        composable(route = Screen.Home.route){
            HomeScreen(navController = navController)
        }
        composable(route = Screen.MobMenu.route){
            MobFoodMenuScreen(navController = navController)
        }
    }

}