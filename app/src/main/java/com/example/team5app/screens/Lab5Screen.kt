package com.example.team5app.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.team5app.R
import com.example.team5app.navigation.DetailsScreen
import com.example.team5app.ui.theme.Accent
import com.example.team5app.ui.theme.Dark
import com.example.team5app.ui.theme.LightBg
import com.example.team5app.ui.theme.Typography

@Composable
fun Lab5Screen(navController: NavController){
    Column(modifier = Modifier.fillMaxWidth().padding(15.dp)) {
        Image(
            painter = painterResource(id = R.drawable.boy1),
            contentDescription = null,
            contentScale = ContentScale.Fit
        )
        Spacer(modifier = Modifier.height(10.dp))
        Lab5ObjectiveSection()
        Spacer(modifier = Modifier.height(15.dp))
        Lab5Task1Card(navController = navController)
        Spacer(modifier = Modifier.height(15.dp))
        Lab5Task2Card(navController = navController)
    }
}

@Composable
fun Lab5ObjectiveSection(){
    Card(
        shape = RoundedCornerShape(20.dp),
        modifier = Modifier
            .fillMaxWidth(),
        elevation = 5.dp
    ) {
        Column(modifier = Modifier
            .fillMaxWidth()
            .background(LightBg)
            .padding(15.dp)) {
            Text(text = "LAB 5 OBJECTIVE", style = Typography.body1, fontWeight = FontWeight.Bold, color = Accent)
            Text(text = stringResource(id = R.string.lab5_objective), style = Typography.body1, color = Dark)
        }
    }
}

@Composable
fun Lab5Task1Card(navController: NavController){
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
                    navController.navigate(DetailsScreen.Lab5Task1.route)
                }
        ) {
            Box(modifier = Modifier
                .padding(15.dp)
                .clip(RoundedCornerShape(10.dp))
                .background(Dark)){
                Icon(
                    painter = painterResource(id = R.drawable.task_icon),
                    contentDescription = null,
                    tint = Accent,
                    modifier = Modifier
                        .padding(10.dp)
                        .size(30.dp)
                )
            }

            Text(text = "Threads & Async Task", style = Typography.body1, fontWeight = FontWeight.Bold, color = Dark)
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

@Composable
fun Lab5Task2Card(navController: NavController){
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
                    navController.navigate(DetailsScreen.Lab5Task2.route)
                }
        ) {
            Box(modifier = Modifier
                .padding(15.dp)
                .clip(RoundedCornerShape(10.dp))
                .background(Dark)){
                Icon(
                    painter = painterResource(id = R.drawable.wifi_icon),
                    contentDescription = null,
                    tint = Accent,
                    modifier = Modifier
                        .padding(10.dp)
                        .size(30.dp)
                )
            }

            Text(text = "Data From Network", style = Typography.body1, fontWeight = FontWeight.Bold, color = Dark)
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

