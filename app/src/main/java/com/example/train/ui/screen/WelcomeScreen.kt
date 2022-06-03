package com.example.train.ui.screen

import android.widget.Space
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.BottomCenter
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import com.example.train.R
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.train.navigation.Screen
import com.example.train.ui.theme.*
import com.google.accompanist.systemuicontroller.rememberSystemUiController

@Composable
fun WelcomeScreen(startController: NavHostController) {

    val systemUiController = rememberSystemUiController()
    systemUiController.setSystemBarsColor(
        color = Background,
        darkIcons = MaterialTheme.colors.isLight
    )

    Box(modifier = Modifier
        .fillMaxSize()
        .background(Background)) {
        Image(
            painter = painterResource(id = R.drawable.background_welcome),
            contentDescription = "",
            contentScale = ContentScale.FillWidth,
            modifier = Modifier.fillMaxWidth()
        )
        Column(
            Modifier
                .fillMaxSize()
                .background(Background)
        ) {
            Spacer(modifier = Modifier.height(10.dp))
            Row(
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.align(CenterHorizontally)
            ) {
                Text(text = "Silent", fontFamily = airBold, fontSize = 20.sp)
                Spacer(modifier = Modifier.width(5.dp))
                Image(painter = painterResource(id = R.drawable.ic_logo), contentDescription = "")
                Spacer(modifier = Modifier.width(5.dp))
                Text(text = "Moon", fontFamily = airBold, fontSize = 20.sp)
            }
            Spacer(modifier = Modifier.height(50.dp))
            Image(
                painter = painterResource(id = R.drawable.welcome_image),
                contentDescription = "",
                modifier = Modifier.fillMaxWidth()
            )
            Spacer(modifier = Modifier.height(70.dp))
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Text(
                    text = "We are what you do",
                    fontFamily = helveticaBold,
                    fontSize = 30.sp,
                    color = Color.Black
                )
                Spacer(modifier = Modifier.height(20.dp))
                Text(
                    text = "Thousand of people are using silent moon  for smalls meditation",
                    fontFamily = helveticaLight,
                    fontSize = 18.sp,
                    lineHeight = 25.sp,
                    textAlign = TextAlign.Center,
                    modifier = Modifier.padding(horizontal = 30.dp),
                    color = Color.Gray
                )
            }
        }

        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxWidth()
                .align(
                    BottomCenter
                )
        ) {
            Button(
                onClick = {
                          startController.navigate(Screen.SignUpScreen.route)
                          },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 20.dp),
                shape = RoundedCornerShape(20.dp),
                colors = ButtonDefaults.buttonColors(
                    backgroundColor = ButtonColor
                )

                ) {
                Text(
                    text = "SIGN UP",
                    fontFamily = helveticaMedium,
                    modifier = Modifier.padding(vertical = 15.dp),
                    color = Color.White
                )
            }
            Spacer(modifier = Modifier.height(10.dp))
            Row(modifier = Modifier.padding(bottom = 25.dp)) {
                Text(
                    text = "ALREADY HAVE AN ACCOUNT?",
                    fontFamily = helveticaMedium,
                    color = Color.Gray
                )
                Spacer(modifier = Modifier.width(5.dp))
                Text(text = "LOG IN", color = ButtonColor, fontFamily = helveticaMedium, modifier = Modifier.clickable {
                    startController.navigate(Screen.SignInScreen.route)
                })
            }
        }
    }
}