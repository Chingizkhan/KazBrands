package com.example.kazbrands.presentation.components.layout

import androidx.compose.foundation.layout.*
import androidx.compose.material.Scaffold
import androidx.compose.material.rememberScaffoldState
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import com.example.kazbrands.presentation.components.bottomBar.BottomBar
import com.example.kazbrands.presentation.components.topBar.TopBar
import com.example.kazbrands.presentation.components.drawer.Drawer

@Composable
fun Layout(
    navController: NavHostController,
    content: @Composable () -> Unit
) {
    val scaffoldState = rememberScaffoldState()
    var layoutState by rememberLayoutState()
    val currentRoute = navController.currentBackStackEntryAsState().value?.destination?.route

    setLayoutListeners(
        currentRoute,
        { layoutState = layoutState.copy(topBarState = it) },
        { layoutState = layoutState.copy(bottomBarState = it) },
        { layoutState = layoutState.copy(drawerGestureState = it) }
    )

    Scaffold(
        scaffoldState = scaffoldState,
        topBar = { TopBar(layoutState.topBarState, currentRoute, navController) },
        bottomBar = { BottomBar(layoutState.bottomBarState, currentRoute, navController) },
        drawerContent = { Drawer() },
        drawerGesturesEnabled = layoutState.drawerGestureState
    ) {
        Column(modifier = Modifier
            .fillMaxSize()
            .padding(it)
        ) {
            content()
        }
    }
}

