package com.example.team5app.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import com.example.team5app.navigation.DetailsScreen

@Composable
fun Lab5Screen(navController: NavController){
    Column() {
        Text(text = "LAB 5 SCREEN")
        Button(onClick = { navController.navigate(DetailsScreen.Lab5Task1.route) }) {
            Text(text = "TASK 1")
        }
        Button(onClick = { navController.navigate(DetailsScreen.Lab5Task2.route) }) {
            Text(text = "TASK 2")
        }

    }
}

