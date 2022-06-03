package com.example.train.ui.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.train.R
import com.example.train.navigation.Screen
import com.example.train.ui.theme.*

@Composable
fun SignInScreen(startController: NavHostController) {
    val email = remember { mutableStateOf("") }
    val password = remember { mutableStateOf("") }

    Box(modifier = Modifier.fillMaxSize().background(Background)) {
        Image(
            painter = painterResource(id = R.drawable.ic_backgroind_sign_up),
            contentDescription = "",
        )
        Column(Modifier.fillMaxSize()) {
            Button(
                onClick = { startController.popBackStack() },
                shape = CircleShape,
                colors = ButtonDefaults.buttonColors(
                    backgroundColor = Color.White
                ),
                modifier = Modifier.padding(start = 20.dp, top = 30.dp)
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.ic_back),
                    contentDescription = "",
                    tint = Color.Black
                )
            }
            Spacer(modifier = Modifier.height(50.dp))
            Text(
                text = "Welcome Back!",
                color = Color.Black,
                modifier = Modifier.align(Alignment.CenterHorizontally),
                fontSize = 30.sp,
                fontFamily = helveticaBold
            )
            Spacer(modifier = Modifier.height(20.dp))
            Button(
                onClick = { /*TODO*/ },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 20.dp),
                colors = ButtonDefaults.buttonColors(
                    backgroundColor = Color.White,
                ),
                shape = RoundedCornerShape(30.dp)
            ) {
                Row(
                    Modifier
                        .fillMaxWidth()
                        .padding(vertical = 10.dp)
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.ic_google),
                        contentDescription = ""
                    )
                    Spacer(modifier = Modifier.width(50.dp))
                    Text(
                        text = "CONTINUE WITH GOOGLE",
                        fontFamily = helveticaBold,
                        color = TextColor,
                        modifier = Modifier.align(Alignment.CenterVertically)
                    )
                }
            }
            Spacer(modifier = Modifier.height(30.dp))
            Text(
                text = "OR LOG IN WITH EMAIL",
                color = TextGray,
                fontFamily = helveticaBold,
                modifier = Modifier.align(Alignment.CenterHorizontally)
            )
            Spacer(modifier = Modifier.height(30.dp))
            TextField(
                value = email.value,
                onValueChange = { new -> email.value = new },
                colors = TextFieldDefaults.textFieldColors(
                    backgroundColor = TextFieldBack,
                    disabledIndicatorColor = Color.Transparent,
                    focusedIndicatorColor = Color.Transparent,
                    unfocusedIndicatorColor = Color.Transparent
                ),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 20.dp),
                shape = RoundedCornerShape(15.dp),
                placeholder = {
                    Text(
                        text = "Email address",
                        fontFamily = helveticaLight,
                        color = TextGray,
                        modifier = Modifier.padding(vertical = 8.dp)
                    )
                },
                maxLines = 1,
                singleLine = true
            )
            Spacer(modifier = Modifier.height(15.dp))
            TextField(
                value = password.value,
                onValueChange = { new -> password.value = new },
                colors = TextFieldDefaults.textFieldColors(
                    backgroundColor = TextFieldBack,
                    disabledIndicatorColor = Color.Transparent,
                    focusedIndicatorColor = Color.Transparent,
                    unfocusedIndicatorColor = Color.Transparent
                ),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 20.dp),
                shape = RoundedCornerShape(15.dp),
                placeholder = {
                    Text(
                        text = "Password",
                        fontFamily = helveticaLight,
                        color = TextGray,
                        modifier = Modifier.padding(vertical = 8.dp)
                    )
                },
                maxLines = 1,
                singleLine = true
            )
            Spacer(modifier = Modifier.height(30.dp))

            Button(
                onClick = {
                    startController.navigate(Screen.MainScreen.route)
                },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 20.dp)
                    .align(Alignment.CenterHorizontally),
                shape = RoundedCornerShape(30.dp),
                colors = ButtonDefaults.buttonColors(
                    backgroundColor = ButtonColor
                )
            ) {
                Text(
                    text = "LOG IN",
                    fontFamily = helveticaMedium,
                    modifier = Modifier.padding(vertical = 15.dp),
                    color = Color.White
                )
            }
            Spacer(modifier = Modifier.height(15.dp))

            Text(
                text = "Forgot Password?",
                fontFamily = helveticaMedium,
                modifier = Modifier.align(Alignment.CenterHorizontally),
                fontSize = 14.sp
            )
        }
        Row(
            modifier = Modifier
                .padding(bottom = 25.dp)
                .align(Alignment.BottomCenter)
        ) {
            Text(
                text = "ALREADY HAVE AN ACCOUNT?",
                fontFamily = helveticaMedium,
                color = Color.Gray
            )
            Spacer(modifier = Modifier.width(5.dp))
            Text(
                text = "SIGN UP",
                color = ButtonColor,
                fontFamily = helveticaMedium,
                modifier = Modifier.clickable {
                    startController.navigate(Screen.SignUpScreen.route)
                })
        }
    }
}