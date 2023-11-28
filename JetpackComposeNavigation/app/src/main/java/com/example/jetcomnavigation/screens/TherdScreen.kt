package com.example.jetcomnavigation.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavHostController
import com.example.jetcomnavigation.navigation.AppScreens

@Composable
fun TherdScreen(navController: NavHostController){
    TherdBodyContent(navController)
}

@Composable
fun TherdBodyContent(navController: NavHostController){
    Box(modifier = Modifier
        .fillMaxSize()
        .background(Color.Red)) {
        Column(modifier = Modifier
            .fillMaxSize()
            .align(Alignment.Center),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ){
            Text("Hi Therd Navigation!")
            Button(onClick = {
                navController.navigate(AppScreens.FirstScreen.route)
//                navController.popBackStack()
            }) {
                Text("Go to First Screen")
            }
        }
    }
}