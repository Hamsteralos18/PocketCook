package com.example.mylogin

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.mylogin.Pages.HomePage
import com.example.mylogin.Pages.SignupPage

@Composable
fun MyAppNavigation(modifier: Modifier= Modifier,authViewModel: AuthViewModel){
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "login", builder = {
        composable("login"){
            LoginScreen(modifier,navController, authViewModel)
        }

        composable("signup"){
            SignupPage(modifier,navController, authViewModel)
        }

        composable("home"){
            HomePage(modifier,navController, authViewModel)
        }

    })
}