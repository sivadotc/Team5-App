package com.example.team5app.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.team5app.R
import com.example.team5app.ui.theme.*


@Composable
fun Lab5Task2(navController: NavController){
    Column(modifier = Modifier
        .fillMaxWidth()
        .padding(15.dp)) {
        Image(
            painter = painterResource(id = R.drawable.boy2),
            contentDescription = null,
            contentScale = ContentScale.Fit
        )
        NetworkExplanation()
        Spacer(modifier = Modifier.height(15.dp))
        Documentation()
        Spacer(modifier = Modifier.height(15.dp))
        NetworkNoteSection()
    }
}

@Composable
fun NetworkExplanation(){
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
            Text(text = "Network Implementation", style = Typography.body1, fontWeight = FontWeight.Bold, color = Accent)
            Text(text = stringResource(id = R.string.async_explanation), style = Typography.body1, color = Dark, textAlign = TextAlign.Justify)
        }
    }
}

@Composable
fun NetworkNoteSection(){
    Card(
        shape = RoundedCornerShape(20.dp),
        modifier = Modifier
            .fillMaxWidth(),
        elevation = 5.dp
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .background(LightAccent)
                .padding(15.dp)
        ) {
            Text(text = "NOTE", style = Typography.body1, fontWeight = FontWeight.Bold, color = Dark)
            Text(text = stringResource(id = R.string.network_note), style = Typography.body1, color = Dark, textAlign = TextAlign.Justify)
        }
    }
}