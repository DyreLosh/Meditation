package com.example.train.navigation

import com.example.train.R

sealed class BottomScreen(val route: String, val image: Int, val title: String) {
    object HomeScreen: BottomScreen("home", R.drawable.ic_home, "Home")
    object SleepScreen: BottomScreen("sleep", R.drawable.ic_sleep, "Sleep")
    object MeditateScreen: BottomScreen("meditate", R.drawable.ic_meditate, "Meditate")
    object MusicScreen: BottomScreen("music", R.drawable.ic_music, "Music")
    object UserScreen: BottomScreen("user", R.drawable.ic_user, "User")
}
