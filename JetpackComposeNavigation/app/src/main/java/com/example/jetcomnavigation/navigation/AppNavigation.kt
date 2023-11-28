package com.example.jetcomnavigation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.jetcomnavigation.screens.FirstScreen
import com.example.jetcomnavigation.screens.SecondScreen
import com.example.jetcomnavigation.screens.TherdScreen

@Composable
fun AppNavigation(){
    val navigationController = rememberNavController()
    NavHost(
        navController = navigationController,
        startDestination = AppScreens.FirstScreen.route
    ) {
        composable(AppScreens.FirstScreen.route ) { FirstScreen(navController = navigationController) }

        composable(
            AppScreens.SecondScreen.route,
            arguments = listOf(navArgument("userId"){
                type = NavType.IntType
            })
        ) {
            SecondScreen(
                navController = navigationController,
                userId = it.arguments?.getInt("userId") ?: 0 )
        }

        composable(AppScreens.TherdScreen.route) { TherdScreen(navController = navigationController) }
    }
}

