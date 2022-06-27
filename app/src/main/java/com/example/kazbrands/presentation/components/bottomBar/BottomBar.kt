package com.example.kazbrands.presentation.components.bottomBar

import androidx.compose.material.BottomAppBar
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import com.example.kazbrands.presentation.components.bottomBar.utils.getBottomBarItems
import com.ramcosta.composedestinations.navigation.navigateTo

@Composable
fun BottomBar(visible: Boolean, currentRoute: String?, navController: NavController) {

    if (visible) {
        BottomAppBar() {
            getBottomBarItems().map {
                BottomBarItem(it, currentRoute) { destination ->
                    navController.navigateTo(destination) {
                        launchSingleTop = true
                    }
                }
            }
        }
    }
}