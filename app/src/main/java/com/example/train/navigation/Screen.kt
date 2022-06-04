package com.example.train.navigation

sealed class Screen(val route: String) {
    object WelcomeScreen: Screen("welcome")
    object SignInScreen: Screen("sign_in")
    object SignUpScreen: Screen("sign_up")
    object WelcomeTwoScreen: Screen("welcome_two")
    object ChooseTopicScreen: Screen("choose_topic")
    object MainScreen: Screen("main")
    object MusicOpenScreen: Screen("music_open")
}
