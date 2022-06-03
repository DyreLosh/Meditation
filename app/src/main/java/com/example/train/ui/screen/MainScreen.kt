package com.example.train.ui.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.train.navigation.BottomScreen
import com.example.train.ui.screen.bottom.*
import com.example.train.ui.theme.Background
import com.example.train.ui.theme.ButtonColor
import com.example.train.ui.theme.TextGray

@Composable
fun MainScreen(startController: NavHostController) {
    val bottomController = rememberNavController()
    Scaffold(Modifier.fillMaxSize(), bottomBar = { BottomNav(bottomController) }) {
        NavHost(
            navController = bottomController,
            startDestination = BottomScreen.HomeScreen.route
        ) {
            composable(BottomScreen.HomeScreen.route) { HomeScreen() }
            composable(BottomScreen.SleepScreen.route) { SleepScreen() }
            composable(BottomScreen.MeditateScreen.route) { MeditateScreen() }
            composable(BottomScreen.MusicScreen.route) { MusicScreen() }
            composable(BottomScreen.UserScreen.route) { UserScreen() }
        }
    }
}

@Composable
fun BottomNav(bottomController: NavHostController) {
    val items = listOf(
        BottomScreen.HomeScreen,
        BottomScreen.SleepScreen,
        BottomScreen.MeditateScreen,
        BottomScreen.MusicScreen,
        BottomScreen.UserScreen
    )
    val backStackEntry = bottomController.currentBackStackEntryAsState()
    val currentPage = backStackEntry.value?.destination?.route
    BottomNavigation(backgroundColor = Color.White) {
        items.forEach { items ->
            BottomNavigationItem(
                selected = currentPage == items.route,
                onClick = {
                    bottomController.navigate(items.route) {
                        bottomController.graph.startDestDisplayName?.let { route ->
                            popUpTo(route) {
                                saveState = true
                            }
                        }
                        restoreState = true
                        launchSingleTop = true
                    }
                },
                selectedContentColor = ButtonColor,
                unselectedContentColor = TextGray,
                icon = {
                    Icon(
                        painter = painterResource(id = items.image),
                        contentDescription = items.title,
                        modifier = Modifier
                            .padding(vertical = 5.dp)

                            )
                },
                label = { Text(text = items.title) },


                )
        }
    }
}