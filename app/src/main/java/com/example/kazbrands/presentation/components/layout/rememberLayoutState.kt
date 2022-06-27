package com.example.kazbrands.presentation.components.layout

import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember

@Composable
fun rememberLayoutState() = remember {
    mutableStateOf(KazBrandsLayoutState(topBarState = true, bottomBarState = true, drawerGestureState = true))
}