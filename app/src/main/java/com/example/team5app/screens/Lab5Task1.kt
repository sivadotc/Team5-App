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
import com.example.team5app.ui.theme.Accent
import com.example.team5app.ui.theme.Dark
import com.example.team5app.ui.theme.LightBg
import com.example.team5app.ui.theme.Typography

@Composable
fun Lab5Task1(navController: NavController) {
    Column(modifier = Modifier
        .fillMaxWidth()
        .padding(15.dp)) {
        Image(
            painter = painterResource(id = R.drawable.girl1),
            contentDescription = null,
            contentScale = ContentScale.Fit
        )
        Spacer(modifier = Modifier.height(10.dp))
        AsyncExplanation()
        Spacer(modifier = Modifier.height(15.dp))
        Documentation()
    }
}

@Composable
fun AsyncExplanation(){
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
            Text(text = "Async Implementation", style = Typography.body1, fontWeight = FontWeight.Bold, color = Accent)
            Text(text = stringResource(id = R.string.async_explanation), style = Typography.body1, color = Dark, textAlign = TextAlign.Justify)
        }
    }
}

@Composable
fun Documentation(){
    Card(
        shape = RoundedCornerShape(20.dp),
        modifier = Modifier
            .fillMaxWidth(),
        elevation = 5.dp
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .background(LightBg)
                .padding(15.dp)
        ) {
            Text(text = "Document", style = Typography.body1, fontWeight = FontWeight.Bold, color = Accent)
            Text(text = stringResource(id = R.string.document), style = Typography.body1, color = Dark, textAlign = TextAlign.Justify)
        }
    }
}