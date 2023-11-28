package com.example.jetcomnavigation.navigation

//sealed class AppScreens(val route: String){
//    object FirstScreen : AppScreens("first_screen")
//    object SecondScreen : AppScreens("second_screen")
//    object TherdScreen : AppScreens("therd_screen")
//}

/*
* En el siguiente codigo se estara realizando el
* envio de parametros entre pantallas
* */
sealed class AppScreens(val route: String){

    object FirstScreen : AppScreens("first_screen")

    object SecondScreen : AppScreens("second_screen/{userId}"){
        fun createRoute(userId: Int) : String{
            return "second_screen/$userId"
        }
    }

    object TherdScreen : AppScreens("therd_screen")
}