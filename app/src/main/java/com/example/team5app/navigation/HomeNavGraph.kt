package com.example.team5app.navigation

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.runtime.Composable
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.example.team5app.screens.*


@RequiresApi(Build.VERSION_CODES.N)
@Composable
fun HomeNavGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        route = Graph.HOME,
        startDestination = BottomBarScreen.Home.route
    ) {
        composable(route = BottomBarScreen.Home.route) {
            HomeScreen(navController = navController)
        }
        composable(route = BottomBarScreen.Profile.route) {
            AllLabScreen(navController = navController)
        }
        composable(route = BottomBarScreen.Settings.route) {
            ProfileScreen()
        }
        detailsNavGraph(navController = navController)
    }
}

fun NavGraphBuilder.detailsNavGraph(navController: NavHostController) {
    navigation(
        route = Graph.DETAILS,
        startDestination = DetailsScreen.Lab5.route
    ) {
        composable(route = DetailsScreen.Lab5Task1.route) {
            Lab5Task1(navController = navController)
        }
        composable(route = DetailsScreen.Lab5Task2.route) {
            Lab5Task2(navController = navController)
        }
        composable(route = DetailsScreen.Lab5.route) {
            Lab5Screen(navController = navController)
        }
    }
}

sealed class DetailsScreen(val route: String) {
    object Lab5 : DetailsScreen(route = "Lab5")
    object Lab5Task1 : DetailsScreen(route = "Lab5Task1")
    object Lab5Task2 : DetailsScreen(route = "Lab5Task2")

}