package com.mobcoder.mob_kitchen_jetpack.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.mobcoder.mob_kitchen_jetpack.R

@Composable
fun HomeScreen(navController: NavHostController) {
    Box(
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

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight()
                .padding(
                    16.dp
                )
        ) {

            Image(
                painter = painterResource(id = R.mipmap.ic_menu),
                contentDescription = "Humburg"
            )
            Spacer(modifier = Modifier.height(12.dp))
            Text(
                modifier = Modifier
                    .fillMaxWidth(),
                text = "Hello Raja",
                style = TextStyle(fontSize = 18.sp, fontWeight = FontWeight.Normal),
                color = Color.DarkGray
            )
            Spacer(modifier = Modifier.height(3.dp))
            Text(
                text = "Welcome Back!",
                modifier = Modifier.fillMaxWidth(),
                style = TextStyle(fontSize = 20.sp, fontWeight = FontWeight.Bold),
                color = Color.Black

            )

            Spacer(modifier = Modifier.height(12.dp))
            Image(
                painter = painterResource(id = R.mipmap.ic_order_bg),
                contentDescription = "Humburg",
                modifier = Modifier
                    .fillMaxWidth()
                    .height(150.dp)
            )
            //...................CardView..................
            Card(
                shape = RoundedCornerShape(8.dp),
                modifier = Modifier
                    .fillMaxWidth()
                    .height(60.dp)
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .fillMaxHeight()
                        .background(colorResource(id = R.color.color_F8C3AE))
                        .padding(10.dp, 0.dp, 10.dp, 0.dp),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Image(
                        painter = painterResource(id = R.mipmap.ic_cross_c),
                        contentDescription = "thumb"
                    )
                    Column(
                        //modifier = Modifier.padding(10.dp, 0.dp, 10.dp, 0.dp)
                    ) {
                        Text(
                            text = "Help us improve!",
                            style = TextStyle(fontSize = 14.sp, fontWeight = FontWeight.Bold),
                            color = Color.Black
                        )
                        Spacer(modifier = Modifier.height(3.dp))
                        Text(
                            text = "Please share your feedback",
                            style = TextStyle(fontSize = 12.sp, fontWeight = FontWeight.Normal),
                            color = Color.Black

                        )

                    }
                    //......................

                    Text(
                        text = "Rate Us",
                        style = TextStyle(fontSize = 14.sp, fontWeight = FontWeight.Bold),
                        color = Color.Black
                    )

                    Image(
                        painter = painterResource(id = R.mipmap.ic_cross_c),
                        contentDescription = "thumb",
                    )
                }
            }
            //..............................Select vendor..............
            Spacer(modifier = Modifier.height(20.dp))
            Row() {
                Image(
                    painter = painterResource(id = R.mipmap.ic_vendor),
                    contentDescription = "thumb"
                )

                Text(
                    modifier = Modifier.padding(10.dp, 0.dp, 0.dp, 0.dp),
                    text = "Select Vendor",
                    style = TextStyle(fontSize = 18.sp, fontWeight = FontWeight.SemiBold),
                    color = Color.Black
                )

            }
            //......................Working on vendors.....................................
            Spacer(modifier = Modifier.height(20.dp))
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(220.dp)
                    .padding(10.dp),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {

                Card(
                    shape = RoundedCornerShape(8.dp),
                    modifier = Modifier
                        .fillMaxWidth()
                        .weight(1f)
                        .fillMaxHeight()
                        .padding(0.dp, 0.dp, 5.dp, 0.dp)
                ) {
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .fillMaxHeight()
                            .padding(6.dp)
                            .background(colorResource(id = R.color.white)),
                        horizontalAlignment = Alignment.CenterHorizontally

                    ) {
                        Image(
                            painter = painterResource(id = R.mipmap.ic_vendor_image),
                            contentDescription = "thumb",
                            modifier = Modifier.size(60.dp, 60.dp)

                        )

                        Spacer(modifier = Modifier.height(6.dp))
                        Text(
                            modifier = Modifier.padding(10.dp, 0.dp, 0.dp, 0.dp),
                            text = "Order From\nMob's Kitchen",
                            style = TextStyle(fontSize = 14.sp, fontWeight = FontWeight.SemiBold),
                            color = Color.Black
                        )
                        Spacer(modifier = Modifier.height(6.dp))
                        Text(
                            modifier = Modifier.padding(10.dp, 0.dp, 0.dp, 0.dp),
                            text = "Vishal Mishra",
                            style = TextStyle(fontSize = 14.sp, fontWeight = FontWeight.Normal),
                            color = Color.Black
                        )
                        Spacer(modifier = Modifier.height(6.dp))
                        Button(
                            onClick = {
                                // User Click on Login Button then goto Home Screen
                            },
                            shape = RoundedCornerShape(45.dp),
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(35.dp),
                            colors = ButtonDefaults.buttonColors(
                                backgroundColor = colorResource(id = R.color.purple_200),
                                contentColor = Color.White
                            )

                        ) {
                            Text(text = "Order now")
                        }
                    }

                }
//.........................
                Card(
                    shape = RoundedCornerShape(8.dp),
                    modifier = Modifier
                        .fillMaxWidth()
                        .weight(1f)
                        .fillMaxHeight()
                        .padding(5.dp, 0.dp, 0.dp, 0.dp)
                ) {
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .fillMaxHeight()
                            .background(colorResource(id = R.color.white))
                    ) {
                        Column(
                            modifier = Modifier
                                .fillMaxWidth()
                                .fillMaxHeight()
                                .padding(6.dp)
                                .background(colorResource(id = R.color.white)),
                            horizontalAlignment = Alignment.CenterHorizontally

                        ) {
                            Image(
                                painter = painterResource(id = R.mipmap.ic_vendor_image),
                                contentDescription = "thumb",
                                modifier = Modifier.size(60.dp, 60.dp)

                            )

                            Spacer(modifier = Modifier.height(6.dp))
                            Text(
                                modifier = Modifier.padding(10.dp, 0.dp, 0.dp, 0.dp),
                                text = "Order From\nMob's Kitchen",
                                style = TextStyle(
                                    fontSize = 14.sp,
                                    fontWeight = FontWeight.SemiBold
                                ),
                                color = Color.Black
                            )
                            Spacer(modifier = Modifier.height(6.dp))
                            Text(
                                modifier = Modifier.padding(10.dp, 0.dp, 0.dp, 0.dp),
                                text = "Manoj Bhai",
                                style = TextStyle(fontSize = 14.sp, fontWeight = FontWeight.Normal),
                                color = Color.Black
                            )
                            Spacer(modifier = Modifier.height(6.dp))
                            Button(
                                onClick = {
                                    navController.navigate("mob_menuFood_screen")
                                    // User Click on Order now Button
                                },
                                shape = RoundedCornerShape(45.dp),
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .height(35.dp),
                                colors = ButtonDefaults.buttonColors(
                                    backgroundColor = colorResource(id = R.color.purple_200),
                                    contentColor = Color.White
                                )

                            ) {
                                Text(text = "Order now")
                            }
                        }

                    }

                }

            }

        }

    }

}