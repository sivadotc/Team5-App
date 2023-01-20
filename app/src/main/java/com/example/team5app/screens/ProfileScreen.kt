package com.example.team5app.screens

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
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.team5app.R
import com.example.team5app.navigation.DetailsScreen
import com.example.team5app.ui.theme.*

@Composable
fun ProfileScreen(){
    Column(modifier = Modifier
        .fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(modifier = Modifier.height(2.dp))
        TopSection()
        Spacer(modifier = Modifier.height(2.dp))
        AllProfiles()

    }
}

@Composable
fun ProfileCards(
    painter: Painter,
    description: String,
    title: String,
    modifier: Modifier = Modifier
){
    Card(
        shape = RoundedCornerShape(20.dp),
        modifier = Modifier
            .fillMaxWidth()
            .height(80.dp)
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
                    painter = painterResource(id = R.drawable.navigate_next),
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
fun AllProfiles(){
    LazyColumn(modifier = Modifier
        .fillMaxWidth()
        .padding(15.dp)
    ){
        item {
            ProfileCards(
                painter = painterResource(id = R.drawable.profile_boy1),
                description = "2019WB86234",
                title = "Narendran"
            )
            ProfileCards(
                painter = painterResource(id = R.drawable.profile_girl1),
                description = "2019WA86533",
                title = "Ramya Shri"
            )
            ProfileCards(
                painter = painterResource(id = R.drawable.profile_boy2),
                description = "2019WA86989",
                title = "Siva"
            )
            ProfileCards(
                painter = painterResource(id = R.drawable.profile_girl2),
                description = "2019WA86196",
                title = "Priyadarshini"
            )
            ProfileCards(
                painter = painterResource(id = R.drawable.profile_boy3),
                description = "2019WA86641",
                title = "Murali"
            )
            ProfileCards(
                painter = painterResource(id = R.drawable.profile_girl3),
                description = "2019WB86302",
                title = "Lavanya"
            )
            ProfileCards(
                painter = painterResource(id = R.drawable.profile_boy4),
                description = "2019WA86953",
                title = "Paul Vijay"
            )
            ProfileCards(
                painter = painterResource(id = R.drawable.profile_girl4),
                description = "2019WA86233",
                title = "Yoga Priya"
            )
            Spacer(modifier = Modifier.height(80.dp))
        }
    }
}

@Composable
fun TopSection(){
    Column(modifier = Modifier
        .fillMaxWidth()
        .padding(horizontal = 15.dp), horizontalAlignment = Alignment.CenterHorizontally) {
        Text(text = "TEAM 5 MEMBERS", style = Typography.body1, fontWeight = FontWeight.Bold)
        Text(text = "Scroll to view all member's profile", style = Typography.body1, fontSize = 14.sp)

    }
}

