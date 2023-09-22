package com.example.food

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController

@Composable
fun HotelsScreen(
    navController: NavController
) {
        Column(
            modifier = Modifier
                .padding(25.dp)
                .fillMaxSize()
        ){
            Spacer(modifier = Modifier.height(6.dp))
            Image(
                painter = painterResource(id = R.drawable.img_1),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .height(200.dp)
                    .width(350.dp)
                )

            Spacer(modifier = Modifier.height(26.dp))

            Text(
                text = "Click on the Hotel you like from the list of hotels below : ",
                fontSize = 26.sp,
                lineHeight = 36.sp,
                fontFamily = FontFamily.Serif,
                fontWeight = FontWeight.Bold,
                )

            Spacer(modifier = Modifier.height(26.dp))
            Text(
                    text = "i. TAJ Hyderabad",
                    fontSize = 26.sp,
                    fontFamily = FontFamily.Serif,
                    fontWeight = FontWeight.Bold,
                    textDecoration = TextDecoration.Underline,
                modifier = Modifier
                    .clickable {
                        navController.navigate(route = Screen.FooditemsScreen.route)
                    }
                )
            Spacer(modifier = Modifier.height(26.dp))
            Text(
                    text = "ii. TAJ Vizag",
                    fontSize = 26.sp,
                    fontFamily = FontFamily.Serif,
                    fontWeight = FontWeight.Bold,
                    textDecoration = TextDecoration.Underline,
                modifier = Modifier
                    .clickable {
                        navController.navigate(route = Screen.FooditemsScreen.route)
                    }
                )
            Spacer(modifier = Modifier.height(26.dp))
            Text(
                    text = "ii. TAJ Vijayawada",
                    fontSize = 26.sp,
                    fontFamily = FontFamily.Serif,
                    fontWeight = FontWeight.Bold,
                    textDecoration = TextDecoration.Underline,
                modifier = Modifier
                    .clickable {
                        navController.navigate(route = Screen.FooditemsScreen.route)
                    }
                )
            Spacer(modifier = Modifier.height(26.dp))
            Text(
                text = "iii. TAJ Mumbai",
                fontSize = 26.sp,
                fontFamily = FontFamily.Serif,
                fontWeight = FontWeight.Bold,
                textDecoration = TextDecoration.Underline,
                modifier = Modifier
                    .clickable {
                        navController.navigate(route = Screen.FooditemsScreen.route)
                    }
            )
            Spacer(modifier = Modifier.height(26.dp))
            Text(
                text = "iv. TAJ Chennai",
                fontSize = 26.sp,
                fontFamily = FontFamily.Serif,
                fontWeight = FontWeight.Bold,
                textDecoration = TextDecoration.Underline,
                modifier = Modifier
                    .clickable {
                        navController.navigate(route = Screen.FooditemsScreen.route)
                    }
            )
            Spacer(modifier = Modifier.height(26.dp))
            Text(
                text = "v. TAJ Delhi",
                fontSize = 26.sp,
                fontFamily = FontFamily.Serif,
                fontWeight = FontWeight.Bold,
                textDecoration = TextDecoration.Underline,
                modifier = Modifier
                    .clickable {
                        navController.navigate(route = Screen.FooditemsScreen.route)
                    }
            )
            }
        }

@Composable
@Preview(showBackground = true)
fun HotelsScreenPreview() {
    HotelsScreen(
        navController = rememberNavController()
    )
}