package com.mobcoder.mob_kitchen_jetpack.auth

import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Email
import androidx.compose.material.icons.rounded.Lock
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Black
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.mobcoder.mob_kitchen_jetpack.R


@Composable
fun LoginScreen(navController: NavHostController) {
    val mContext = LocalContext.current
    Box(
        // contentAlignment = Alignment.Center,
        modifier = Modifier
            .fillMaxSize()
            .fillMaxWidth()
    ) {
        Image(
            painter = painterResource(id = R.mipmap.ic_bg),
            contentScale = ContentScale.FillWidth,
            contentDescription = "beach resort",
            modifier = Modifier
                .fillMaxSize()
                .fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(50.dp))

        Column(
            modifier = Modifier
                .fillMaxSize()
                .fillMaxWidth()
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(id = R.mipmap.ic_kict_1),
                contentDescription = "beach resort",
                modifier = Modifier
                    .size(200.dp, 200.dp)
            )


            val username = remember { mutableStateOf("") }
            val password = remember { mutableStateOf("") }


            Spacer(modifier = Modifier.height(20.dp))

            Row(
                modifier = Modifier
            ) {

                Icon(
                    Icons.Rounded.Email,
                    contentDescription = "Localized description",
                    tint = Black
                )

                Text(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(6.dp, 0.dp, 0.dp, 0.dp),
                    text = "Email",
                    style = TextStyle(fontSize = 14.sp, fontFamily = FontFamily.Default),
                    color = Black
                )
            }

            Spacer(modifier = Modifier.height(6.dp))

            OutlinedTextField(
                value = username.value,
                singleLine = true,
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email),
                onValueChange = {
                    username.value = it
                },
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(20.dp),
                placeholder = {
                    Text(text = "Type Email")
                },
                colors = TextFieldDefaults.outlinedTextFieldColors(
                    focusedBorderColor = Black,
                    unfocusedBorderColor = Black
                )
            )
            //......................Password...............................
            Spacer(modifier = Modifier.height(20.dp))

            Row(
                modifier = Modifier
            ) {

                Icon(
                    Icons.Rounded.Lock,
                    contentDescription = "Localized description",
                    tint = Black
                )

                Text(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(6.dp, 0.dp, 0.dp, 0.dp),
                    text = "Password",
                    style = TextStyle(fontSize = 14.sp, fontFamily = FontFamily.Default),
                    color = Black
                )
            }

            Spacer(modifier = Modifier.height(6.dp))

            OutlinedTextField(
                value = password.value,
                singleLine = true,
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
                onValueChange = {
                    password.value = it
                },
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(20.dp),
                placeholder = {
                    Text(text = "Type Email")
                },
                colors = TextFieldDefaults.outlinedTextFieldColors(
                    focusedBorderColor = Black,
                    unfocusedBorderColor = Black
                ),
                trailingIcon = {
                    IconButton(onClick = { /*TODO*/ }) {
                        Icon(
                            painter = painterResource(id = R.mipmap.ic_password_show),
                            contentDescription = "Hide password",
                            tint = Black)
                    }
                }
            )

            Spacer(modifier = Modifier.height(6.dp))
            Text(
                modifier = Modifier.fillMaxWidth(),
                text = "Forgot Password ?",
                textAlign = TextAlign.Right,
                style = TextStyle(fontSize = 14.sp, fontFamily = FontFamily.Default),
                color = Black
            )
            Spacer(modifier = Modifier.height(10.dp))
            Button(
                onClick = {
//                    if (username.value.isEmpty()) {
//                        Toast.makeText(mContext, "Username is Empty", Toast.LENGTH_SHORT).show()
//                    }
//                    if (password.value.isEmpty()) {
//                        Toast.makeText(mContext, "Password is Empty", Toast.LENGTH_SHORT).show()
//                    } else {
//                        navController.navigate("home_screen")
//                    }
                      navController.navigate("home_screen")
                    // User Click on Login Button then goto Home Screen
                },
                shape = RoundedCornerShape(50.dp),
                modifier = Modifier
                    .fillMaxWidth()
                    .height(50.dp),
                colors = ButtonDefaults.buttonColors(
                    backgroundColor = Black,
                    contentColor = Color.White)
            ) {
                Text(text = "Login")
            }
        }
    }
}