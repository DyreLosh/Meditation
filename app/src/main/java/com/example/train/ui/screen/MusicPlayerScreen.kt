package com.example.train.ui.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.Center
import androidx.compose.ui.Alignment.Companion.CenterVertically
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.train.R
import com.example.train.ui.theme.*

@Composable
fun MusicPlayerScreen(startController: NavHostController) {
    val likeButtonEnabled = remember { mutableStateOf(false) }
    val playerStartStop = remember { mutableStateOf(false) }
    val playerSlider = remember { mutableStateOf(0.0f) }
    val playerAllLength = remember { mutableStateOf(0f) }
    val playerNowLength = remember { mutableStateOf(0f) }

    Box(modifier = Modifier.fillMaxSize()) {
        Image(
            painter = painterResource(id = R.drawable.ic_music_back),
            contentDescription = "",
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.FillBounds
        )
        Row(
            Modifier
                .fillMaxWidth()
                .padding(top = 25.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
        ) {
            Button(
                onClick = { startController.popBackStack() },
                shape = CircleShape,
                colors = ButtonDefaults.buttonColors(
                    backgroundColor = Color.White
                ),
                modifier = Modifier
                    .padding(start = 20.dp)
                    .align(CenterVertically)
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.ic_cancel),
                    contentDescription = "",
                    tint = TextColor
                )
            }
            Button(
                onClick = { likeButtonEnabled.value = !likeButtonEnabled.value },
                shape = CircleShape,
                colors = ButtonDefaults.buttonColors(
                    backgroundColor = LikeBackground
                ),
                modifier = Modifier
                    .padding(end = 20.dp)
                    .size(50.dp)
                    .align(CenterVertically),
                contentPadding = PaddingValues(0.dp)
            ) {
                Icon(
                    painter = if (likeButtonEnabled.value) {
                        painterResource(id = R.drawable.ic_like_enabled)
                    } else {
                        painterResource(id = R.drawable.ic_like)
                    },
                    contentDescription = "",
                    tint = if (likeButtonEnabled.value) {
                        LikeEnabled
                    } else {
                        Color.White
                    }
                )
            }
        }

        Column(
            Modifier
                .fillMaxWidth()
                .align(Center), horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "Focus Attention",
                color = TextColor,
                fontFamily = helveticaBold,
                fontSize = 30.sp
            )
            Spacer(modifier = Modifier.height(5.dp))
            Text(text = "7 DAYS OF CALM", color = TextGray, fontFamily = helveticaMedium)
            Spacer(modifier = Modifier.height(200.dp))
            Row(
                horizontalArrangement = Arrangement.SpaceAround,
                modifier = Modifier.fillMaxWidth()
            ) {
                Image(
                    painter = painterResource(id = R.drawable.ic_music_minus),
                    contentDescription = "",
                    modifier = Modifier
                        .align(CenterVertically)
                        .padding(start = 20.dp)
                        .clickable {
                            playerSlider.value -= 15
                        }

                )
                Button(
                    onClick = { playerStartStop.value = !playerStartStop.value },
                    shape = CircleShape,
                    colors = ButtonDefaults.buttonColors(
                        backgroundColor = TextColor
                    ),
                    modifier = Modifier
                        .size(80.dp)
                        .align(CenterVertically),
                    contentPadding = PaddingValues(0.dp)
                ) {
                    Icon(
                        painter = if (playerStartStop.value) {
                            painterResource(id = R.drawable.ic_stop)
                        } else {
                            painterResource(id = R.drawable.ic_start)
                        },
                        contentDescription = "",
                        tint = Color.White,
                        modifier = Modifier.size(25.dp)
                    )
                }
                Image(
                    painter = painterResource(id = R.drawable.ic_music_plus),
                    contentDescription = "",
                    modifier = Modifier
                        .align(CenterVertically)
                        .padding(end = 20.dp)
                        .clickable {
                            playerSlider.value += 15
                        }
                )
            }
            playerAllLength.value = 45.22f //позже будет идти с сервера

            Spacer(modifier = Modifier.height(20.dp))
            Slider(
                value = playerSlider.value, onValueChange = { playerSlider.value = it },
                valueRange = 0f..playerAllLength.value,
                colors = SliderDefaults.colors(
                    thumbColor = TextColor,
                    inactiveTrackColor = TextGray,
                    activeTrackColor = TextColor

                ),

                modifier = Modifier.padding(horizontal = 20.dp)
            )
            Spacer(modifier = Modifier.height(3.dp))
            if(playerSlider.value < 0) {
                playerSlider.value = 0F
            }
            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(
                    text = playerSlider.value.toString(),
                    modifier = Modifier.padding(start = 20.dp)
                )
                Text(
                    text = playerAllLength.value.toString(),
                    modifier = Modifier.padding(end = 20.dp)
                )
            }

        }
    }
}