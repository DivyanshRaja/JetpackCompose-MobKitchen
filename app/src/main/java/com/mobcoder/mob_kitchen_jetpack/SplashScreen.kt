package com.mobcoder.mob_kitchen_jetpack

import android.view.animation.OvershootInterpolator
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import kotlinx.coroutines.delay

@Composable
fun SplashScreen(navController: NavHostController) {
    val scale = remember {
        androidx.compose.animation.core.Animatable(0f)
    }
    // AnimationEffect
    LaunchedEffect(key1 = true) {
        scale.animateTo(
            targetValue = 0.7f,
            animationSpec = tween(
                durationMillis = 800,
                easing = {
                    OvershootInterpolator(4f).getInterpolation(it)
                })
        )
        delay(3000L)
        // navigate from Splash screen to Login Screen
        navController.navigate("login_screen")
    }

    // Image
    Box(
        //  contentAlignment = Alignment.Center,
        modifier = Modifier
            .fillMaxSize()
            .fillMaxWidth()
    )
    {

        Image(
            painter = painterResource(id = R.mipmap.ic_splash),
            contentDescription = "beach resort",
            contentScale = ContentScale.FillWidth,
            modifier = Modifier
                .fillMaxSize()
                .fillMaxWidth()
        )

        Column(
            modifier = Modifier
                .fillMaxSize()
                .fillMaxWidth(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(id = R.mipmap.ic_kict_1),
                contentDescription = "Logo",
                modifier = Modifier.scale(scale.value)
            )

            Text(
                text = "MOB's Kitchen",
                style = TextStyle(fontSize = 40.sp, fontFamily = FontFamily.Default)
            )

            Text(
                text = "Place Your Order",
                style = TextStyle(fontSize = 12.sp, fontFamily = FontFamily.Default)
            )
        }


    }
}