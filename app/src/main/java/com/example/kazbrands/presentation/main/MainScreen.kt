package com.example.kazbrands.presentation.main

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavController
import com.example.kazbrands.presentation.destinations.LoginScreenDestination
import com.example.kazbrands.utils.mainScreenRoute
import com.ramcosta.composedestinations.annotation.Destination
import com.ramcosta.composedestinations.navigation.DestinationsNavigator
import kotlinx.coroutines.launch

@Destination(start = true, route = mainScreenRoute)
@Composable
fun MainScreen(
    navigator: DestinationsNavigator,
    navController: NavController
) {
    val scrollState = rememberScrollState()
    val scope = rememberCoroutineScope()

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Green)
    ) {
        Column(
            Modifier
                .align(Alignment.Center)
                .verticalScroll(scrollState)
        ) {
            Text(text = "Main Screen")
            Button(onClick = {
                scope.launch {
                    navigator.navigate(LoginScreenDestination())
                }
            }) {
                Text("navigate to login")
            }
        }
    }
}