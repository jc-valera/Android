package com.example.jcsplashscreen.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.jcsplashscreen.MainScreen
import com.example.jcsplashscreen.SplashScreeen

@Composable
fun AppNavigation(){

    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = AppScreens.SplashScreen.route
    ){
        composable(AppScreens.SplashScreen.route){
            SplashScreeen(navController)
        }
        composable(AppScreens.MainScreen.route){
            MainScreen()
        }
    }
}
