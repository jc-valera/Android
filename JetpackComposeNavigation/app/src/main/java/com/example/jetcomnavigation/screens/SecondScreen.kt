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
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.jetcomnavigation.navigation.AppScreens

@Composable
fun SecondScreen(navController: NavHostController, userId: Int){
    SecondBodyContent(navController, userId)
}

@Composable
fun SecondBodyContent(navController: NavHostController, userId: Int){
    Box(modifier = Modifier
        .fillMaxSize()
        .background(Color.Gray)) {
        Column(modifier = Modifier
            .fillMaxSize()
            .align(Alignment.Center),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ){
            Text(
                text = "Second screen \nYour user Id is: $userId",
                fontSize = 20.sp,
                color = Color.White
            )
            Button(onClick = {
                navController.navigate(AppScreens.TherdScreen.route)
//                navController.popBackStack()
            }) {
                Text("Go to Therd Screen")
            }
        }
    }
}

//@Preview(showBackground = true)
//@Composable
//fun SecondDefaultPreview(){
//    SecondScreen()
//}