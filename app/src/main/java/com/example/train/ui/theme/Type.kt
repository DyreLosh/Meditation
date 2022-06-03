package com.example.train.ui.theme

import androidx.compose.material.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.train.R


val helveticaMedium = FontFamily(Font(R.font.helvetica_medium))
val helveticaBold = FontFamily(Font(R.font.helvetica_bold))
val helveticaLight = FontFamily(Font(R.font.helvetica_light))
val helveticaBlack = FontFamily(Font(R.font.helvetica_black))

val airRegular = FontFamily(Font(R.font.air_regular))
val airRegularTwo = FontFamily(Font(R.font.air_regular_two))
val airBold = FontFamily(Font(R.font.air_bold))
val airBlack = FontFamily(Font(R.font.air_black))
val airLight = FontFamily(Font(R.font.air_light))

// Set of Material typography styles to start with
val Typography = Typography(
    body1 = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp
    )
    /* Other default text styles to override
    button = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.W500,
        fontSize = 14.sp
    ),
    caption = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp
    )
    */
)