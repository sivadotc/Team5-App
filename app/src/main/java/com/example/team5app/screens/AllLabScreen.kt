package com.example.team5app.screens

import android.graphics.Color
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.team5app.ui.theme.Typography
import com.example.team5app.R
import com.example.team5app.navigation.DetailsScreen
import com.example.team5app.ui.theme.Accent
import com.example.team5app.ui.theme.Dark


@Composable
fun AllLabScreen(navController: NavController){
    Column(modifier = Modifier
        .fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(modifier = Modifier.height(20.dp))
        Text(text = "SDPD LAB ASSIGNMENTS", style = Typography.body1, fontWeight = FontWeight.Bold)
        Text(text = "Scroll to view all assignment cards", style = Typography.body2, fontSize = 14.sp)
        Spacer(modifier = Modifier.height(5.dp))
        AllAssignments(navController = navController)

    }
}

@Composable
fun AssignmentCards(
    painter: Painter,
    description: String,
    title: String,
    modifier: Modifier = Modifier,
    onClick: () -> Unit
){
    Card(
        shape = RoundedCornerShape(20.dp),
        modifier = Modifier
            .fillMaxWidth()
            .height(90.dp)
            .padding(top = 8.dp),
        elevation = 5.dp
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Start,
            modifier = Modifier
                .fillMaxWidth()
                .clip(RoundedCornerShape(20.dp))
                .clickable {
                    onClick
                }
        ) {
            Image(
                painter = painter,
                contentDescription = null,
                contentScale = ContentScale.Fit,
                modifier = Modifier.size(80.dp)
            )

            Column(modifier = Modifier.padding(5.dp)) {
                Text(text = title, style = Typography.body1, fontWeight = FontWeight.Bold, color = Dark)
                Text(text = description, style = Typography.body1, color = Dark, fontSize = 14.sp)
            }
            Row(horizontalArrangement = Arrangement.End, modifier = Modifier
                .fillMaxWidth()
                .padding(15.dp)) {
                Icon(
                    painter = painterResource(id = R.drawable.done_icon),
                    contentDescription = null,
                    tint = Dark,
                    modifier = Modifier
                        .padding(10.dp)
                        .size(35.dp))
            }
        }
    }
}

@Composable
fun AllAssignments(navController: NavController){
    LazyColumn(modifier = Modifier
        .fillMaxWidth()
        .padding(15.dp)
    ){
        item {
            AssignmentCards(
                painter = painterResource(id = R.drawable.boy2),
                description = "Architecture of Android",
                title = "Lab Assignment 1",
                onClick = {navController.navigate(DetailsScreen.Lab5.route)}
            )
            AssignmentCards(
                painter = painterResource(id = R.drawable.girl2),
                description = "Simple Android App",
                title = "Lab Assignment 2",
                onClick = { navController.navigate(DetailsScreen.Lab5.route) }
            )
            AssignmentCards(
                painter = painterResource(id = R.drawable.boy2),
                description = "Activity and Permissions",
                title = "Lab Assignment 3",
                onClick = {navController.navigate(DetailsScreen.Lab5.route)}
            )
            AssignmentCards(
                painter = painterResource(id = R.drawable.girl2),
                description = "Elegant UI",
                title = "Lab Assignment 4",
                onClick = {navController.navigate(DetailsScreen.Lab5.route)}
            )
            AssignmentCards(
                painter = painterResource(id = R.drawable.boy2),
                description = "Async and Networking",
                title = "Lab Assignment 5",
                onClick = {navController.navigate(DetailsScreen.Lab5.route)}
            )
            AssignmentCards(
                painter = painterResource(id = R.drawable.girl2),
                description = "User Notifications",
                title = "Lab Assignment 6",
                onClick = {navController.navigate(DetailsScreen.Lab5.route)}
            )
            AssignmentCards(
                painter = painterResource(id = R.drawable.boy2),
                description = "SMS and Multimedia",
                title = "Lab Assignment 7",
                onClick = {navController.navigate(DetailsScreen.Lab5.route)}
            )
            AssignmentCards(
                painter = painterResource(id = R.drawable.girl2),
                description = "Sensors and Maps",
                title = "Lab Assignment 8",
                onClick = {navController.navigate(DetailsScreen.Lab5.route)}
            )
            Spacer(modifier = Modifier.height(80.dp))
        }
    }
}
