package com.example.train.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.train.ui.screen.*

@Composable
fun Navigation() {
    val startController = rememberNavController()

    NavHost(navController = startController, startDestination = Screen.WelcomeScreen.route) {

        composable(Screen.WelcomeScreen.route) { WelcomeScreen(startController)}
        composable(Screen.SignInScreen.route) { SignInScreen(startController)}
        composable(Screen.SignUpScreen.route) { SignUpScreen(startController)}
        composable(Screen.WelcomeTwoScreen.route) { WelcomeScreenTwo(startController)}
        composable(Screen.MainScreen.route) { MainScreen(startController)}
        composable(Screen.ChooseTopicScreen.route) { ChooseTopicScreen(startController)}

    }
}