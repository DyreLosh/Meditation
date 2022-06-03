package com.example.train.ui.screen.bottom

import android.widget.Space
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterStart
import androidx.compose.ui.Alignment.Companion.CenterVertically
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.train.R
import com.example.train.ui.theme.*

@Composable
fun HomeScreen() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Background)
    ) {
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
                modifier = Modifier.align(Alignment.CenterHorizontally)
            ) {
                Text(text = "Silent", fontFamily = airBold, fontSize = 20.sp)
                Spacer(modifier = Modifier.width(5.dp))
                Image(painter = painterResource(id = R.drawable.ic_logo), contentDescription = "")
                Spacer(modifier = Modifier.width(5.dp))
                Text(text = "Moon", fontFamily = airBold, fontSize = 20.sp)
            }

            Text(
                text = "Hello, name",
                fontFamily = helveticaBold,
                fontSize = 30.sp,
                modifier = Modifier.padding(start = 20.dp, top = 10.dp)
            )
            Spacer(modifier = Modifier.height(10.dp))
            Text(
                text = "We Wish you have a good day",
                fontFamily = helveticaLight,
                fontSize = 23.sp,
                modifier = Modifier.padding(start = 20.dp),
                color = TextGray
            )
            Spacer(modifier = Modifier.height(20.dp))
            CourseCard()
            Spacer(modifier = Modifier.height(20.dp))
            Card {
                Image(
                    painter = painterResource(id = R.drawable.ic_group_6859),
                    contentDescription = "",
                    modifier = Modifier.fillMaxWidth().padding(20.dp),
                    contentScale = ContentScale.FillWidth
                )
            }
        }
    }
}

@Composable
fun CourseCard() {
    Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween) {
        Card(
            modifier = Modifier
                .weight(1f)
                .height(200.dp)
                .padding(start = 20.dp), shape = RoundedCornerShape(20.dp)
        ) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(200.dp)
                    .background(ButtonColor)
                    .padding(bottom = 10.dp)
            ) {
                Column(
                    modifier = Modifier
                        .align(CenterStart)
                        .padding(start = 10.dp)
                ) {
                    Text(
                        text = "Basics",
                        fontFamily = helveticaBold,
                        color = Color.White,
                        fontSize = 20.sp
                    )
                    Spacer(modifier = Modifier.height(5.dp))
                    Text(
                        text = "COURSE",
                        fontFamily = helveticaBold,
                        color = Color.White,
                        fontSize = 12.sp
                    )
                }
                Image(
                    painter = painterResource(id = R.drawable.ic_one_card),
                    contentDescription = "",
                    modifier = Modifier.align(
                        Alignment.TopEnd
                    )
                )
                Row(
                    modifier = Modifier.align(
                        Alignment.BottomCenter
                    )
                ) {
                    Text(
                        text = "3-10 мин",
                        color = Color.White,
                        modifier = Modifier
                            .align(CenterVertically),
                        fontSize = 14.sp,
                        fontFamily = helveticaMedium
                    )
                    Spacer(modifier = Modifier.width(10.dp))
                    Button(
                        onClick = { /*TODO*/ }, shape = CircleShape,
                        colors = ButtonDefaults.buttonColors(
                            backgroundColor = Color.White
                        )
                    ) {
                        Text(text = "START", color = TextColor)
                    }
                }
            }
        }
        Spacer(modifier = Modifier.width(20.dp))
        Card(
            modifier = Modifier
                .weight(1f)
                .height(200.dp)
                .padding(end = 20.dp), shape = RoundedCornerShape(20.dp)
        ) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(200.dp)
                    .background(Color(0xFFFFDB9D))
            ) {
                Image(
                    painter = painterResource(id = R.drawable.back_image_two),
                    contentDescription = "",
                    modifier = Modifier
                        .align(
                            Alignment.TopEnd
                        )
                        .size(110.dp)
                )
                Column(
                    modifier = Modifier
                        .align(CenterStart)
                        .padding(start = 10.dp)
                ) {
                    Text(
                        text = "Relaxation",
                        fontFamily = helveticaBold,
                        color = TextColor,
                        fontSize = 20.sp
                    )
                    Spacer(modifier = Modifier.height(5.dp))
                    Text(
                        text = "MUSIC",
                        fontFamily = helveticaBold,
                        color = TextColor,
                        fontSize = 12.sp
                    )
                }
                Row(
                    modifier = Modifier
                        .align(
                            Alignment.BottomCenter
                        )
                        .padding(bottom = 10.dp)
                ) {
                    Text(
                        text = "3-10 мин",
                        color = TextColor,
                        modifier = Modifier
                            .align(CenterVertically),
                        fontSize = 14.sp,
                        fontFamily = helveticaMedium
                    )
                    Spacer(modifier = Modifier.width(10.dp))
                    Button(
                        onClick = { /*TODO*/ }, shape = CircleShape,
                        colors = ButtonDefaults.buttonColors(
                            backgroundColor = TextColor
                        )
                    ) {
                        Text(text = "START", color = Color.White)
                    }
                }
            }
        }
    }
}