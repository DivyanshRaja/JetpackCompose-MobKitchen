package com.mobcoder.mob_kitchen_jetpack.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.mobcoder.mob_kitchen_jetpack.R
import com.mobcoder.mob_kitchen_jetpack.model.FoodDetails


@Composable
fun MobFoodMenuScreen(navController: NavController) {

    Box(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
    ) {

        Image(
            painter = painterResource(id = R.mipmap.ic_bg),
            contentScale = ContentScale.FillWidth,
            contentDescription = null,
            modifier = Modifier
                .fillMaxSize()
        )
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight()
                .padding(12.dp)
        ) {
            // This Row is used for Title and Back button
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
            ) {
                Image(
                    painter = painterResource(id = R.drawable.ic_baseline_arrow_back),
                    contentDescription = null
                )

                Text(
                    modifier = Modifier
                        .fillMaxWidth(),
                    text = "MOB's Menu",
                    style = TextStyle(fontSize = 20.sp, fontWeight = FontWeight.SemiBold),
                    color = Color.Black,
                    textAlign = TextAlign.Center
                )

            }
            Spacer(modifier = Modifier.height(12.dp))

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
                        painter = painterResource(id = R.mipmap.ic_vendor),
                        contentDescription = "thumb"
                    )

                    Text(
                        text = "Manoj",
                        style = TextStyle(fontSize = 14.sp, fontWeight = FontWeight.Bold),
                        color = Color.Black
                    )
                    //......................

                    Card(
                        shape = RoundedCornerShape(12.dp),
                        modifier = Modifier
                            .height(28.dp)
                            .width(65.dp)
                    ) {
                        Row(
                            modifier = Modifier
                                .fillMaxSize()
                                .background(colorResource(id = R.color.purple_700)),
                            horizontalArrangement = Arrangement.SpaceEvenly,
                            verticalAlignment = Alignment.CenterVertically

                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.ic_baseline_call),
                                contentDescription = "thumb",
                                modifier = Modifier
                                    .height(12.dp)
                                    .width(12.dp)
                            )

                            Text(
                                text = "Call",
                                style = TextStyle(fontSize = 10.sp, fontWeight = FontWeight.Normal),
                                color = Color.Black,
                                textAlign = TextAlign.End
                            )

                        }

                    }
                }
            }

            Spacer(modifier = Modifier.height(12.dp))
            // Call a fun to show food list Its a LazyColumn same as RecyclerView
            FoodContent()


        }

    }
}

@Composable
fun FoodContent() {
    val listOfFood = remember { FoodDetails.foodDetailsList }


    Column(Modifier.fillMaxSize()) {
        LazyColumn(Modifier.weight(1f)) {

            items(listOfFood) {
                FoodCard(foods = it)
            }
        }
        // Working on Checkout Button
        Spacer(modifier = Modifier.height(12.dp))
        Button(
            onClick = {

            },
            shape = RoundedCornerShape(50.dp),
            modifier = Modifier
                .fillMaxWidth()
                .height(50.dp),
            colors = ButtonDefaults.buttonColors(
                backgroundColor = Color.Black,
                contentColor = Color.White
            )
        ) {
            Text(text = "Checkout")
        }
    }

}

