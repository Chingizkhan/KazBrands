package com.example.kazbrands.presentation.login

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavController
import com.example.kazbrands.presentation.destinations.MainScreenDestination
import com.example.kazbrands.utils.loginScreenRoute
import com.ramcosta.composedestinations.annotation.Destination
import com.ramcosta.composedestinations.navigation.DestinationsNavigator

@Destination(route = loginScreenRoute)
@Composable
fun LoginScreen(
    navigator: DestinationsNavigator,
    navController: NavController
) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Green)
    ) {
        Column(Modifier.align(Alignment.Center)) {
            Text(text = "Login Screen")
            Button(onClick = { navigator.navigate(MainScreenDestination()) }) {
                Text("Main")
            }
        }
    }
}