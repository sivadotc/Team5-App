package com.example.team5app.screens

import android.icu.util.Calendar
import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.team5app.R
import com.example.team5app.navigation.DetailsScreen
import com.example.team5app.navigation.MainScreen
import com.example.team5app.ui.theme.Accent
import com.example.team5app.ui.theme.Dark
import com.example.team5app.ui.theme.Typography

@RequiresApi(Build.VERSION_CODES.N)
@Composable
fun HomeScreen(navController: NavController) {
    Column(modifier = Modifier
        .fillMaxWidth()
        .padding(15.dp)
    ) {
        GreetingSection()
        Text(text = "This is your Lab Assignment App", style = Typography.body1)
        Image(
            painter = painterResource(id = R.drawable.home_image),
            contentDescription = null,
            contentScale = ContentScale.Fit
        )
        Spacer(modifier = Modifier.height(15.dp))
        Card(
            shape = RoundedCornerShape(20.dp),
            modifier = Modifier.fillMaxWidth(),
            elevation = 5.dp
        ) {
            Row(verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Start,
                modifier = Modifier
                    .fillMaxWidth()
                    .clip(RoundedCornerShape(20.dp))
                    .clickable {
                        navController.navigate(DetailsScreen.Lab5.route)
                    }
            ) {
                Box(modifier = Modifier
                    .padding(15.dp)
                    .clip(RoundedCornerShape(10.dp))
                    .background(Dark)){
                    Icon(
                        painter = painterResource(id = R.drawable.assignment),
                        contentDescription = null,
                        tint = Accent,
                        modifier = Modifier
                            .padding(10.dp)
                            .size(30.dp)
                    )
                }

                Text(text = "Lab Assignment 5", style = Typography.body1, fontWeight = FontWeight.Bold, color = Dark)
                Row(horizontalArrangement = Arrangement.End, modifier = Modifier
                    .fillMaxWidth()
                    .padding(15.dp)) {
                    Icon(
                        painter = painterResource(id = R.drawable.navigate_next),
                        contentDescription = null,
                        tint = Accent,
                        modifier = Modifier
                            .padding(10.dp)
                            .size(35.dp))
                }
            }
        }

    }
}


@RequiresApi(Build.VERSION_CODES.N)
@Composable
fun GreetingSection(){
    val currentTime = Calendar.getInstance().time
    val greeting: String = when (currentTime.hours) {
        in 0..11 -> "Good morning!"
        in 12..15 -> "Good afternoon!"
        else -> "Good evening!"
    }
    Row() {
        Text(text = "Hello, ", style = Typography.h2)
        Text(text = greeting, style = Typography.h2)
    }

}