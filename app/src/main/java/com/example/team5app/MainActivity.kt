package com.example.team5app

import android.content.ContentValues.TAG
import android.os.Build
import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.annotation.RequiresApi
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.rememberNavController
import com.example.team5app.navigation.RootNavigationGraph
import com.example.team5app.ui.theme.Team5AppTheme

import kotlinx.coroutines.*
import kotlin.system.measureTimeMillis

class MainActivity : ComponentActivity() {


    @RequiresApi(Build.VERSION_CODES.N)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Team5AppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    RootNavigationGraph(navController = rememberNavController())

                }
            }
        }
        GlobalScope.launch (Dispatchers.IO){
            val time = measureTimeMillis {
                val answer1 = async { networkCall1() }
                val answer2 = async { networkCall2() }
                Log.d(TAG, "${answer1.await()} Completed")
                Log.d(TAG, "${answer2.await()} Completed")
            }
            Log.d(TAG, "The Request took $time ms.")
        }
    }
}

suspend fun networkCall1(): String{
    delay(3000L)
    return "Network Call 1"
}

suspend fun networkCall2(): String{
    delay(3000L)
    return "Network Call 2"
}

