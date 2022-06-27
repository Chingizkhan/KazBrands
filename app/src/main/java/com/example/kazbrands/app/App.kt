package com.example.kazbrands.app

import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import com.example.kazbrands.presentation.NavGraphs
import com.example.kazbrands.presentation.components.layout.Layout
import com.google.accompanist.navigation.animation.rememberAnimatedNavController
import com.ramcosta.composedestinations.DestinationsNavHost

@ExperimentalAnimationApi
@Composable
fun App() {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colors.background
    ) {
        val navController = rememberAnimatedNavController()

        Layout(navController) {
            DestinationsNavHost(navGraph = NavGraphs.root, navController = navController)
        }
    }
}