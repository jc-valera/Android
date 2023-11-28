package com.example.jetcomnavigation.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.*
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.jetcomnavigation.navigation.AppScreens

@Composable
fun FirstScreen(navController: NavHostController){
    BodyContent(navController)
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
private fun BodyContent(navController: NavHostController){

    var userId by remember { mutableStateOf("") }

    Box(modifier = Modifier
        .fillMaxSize()
        .background(Color.LightGray)){
        Column(modifier = Modifier
            .fillMaxSize()
            .align(Alignment.Center),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ){
            Text(
                text = "First Screen",
                fontSize = 20.sp,
                color = Color.White
            )
            Spacer(
                modifier = Modifier.padding(8.dp)
            )
            OutlinedTextField(
                value = userId,
                onValueChange = {userId = it},
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
                label = {
                    Text(text = "Id Usuario")
                }
            )
            Spacer(
                modifier = Modifier.padding(8.dp)
            )
            Button(onClick = {
//                navController.navigate(AppScreens.SecondScreen.route)
                if (userId == "") userId = 0.toString()
                navController.navigate(AppScreens.SecondScreen.createRoute(userId.toInt()))
            }) {
                Text(text = "Go to Second Screen")
            }
        }
    }
//    Column(
//        modifier = Modifier.fillMaxSize(),
//        verticalArrangement = Arrangement.Center,
//        horizontalAlignment = Alignment.CenterHorizontally
//    ){
//        Text("First Navigation!")
//        Button(onClick = {
//            navController.navigate(route = AppScreens.SecondScreen.route)
//        }) {
//            Text("Navega")
//        }
//    }
}

//@Preview(showBackground = true)
//@Composable
//fun DefaultPreview(){
//    FirstScreen()
//}