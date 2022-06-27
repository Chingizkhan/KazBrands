package com.example.kazbrands.presentation.components.topBar

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.navigation.NavController
import com.example.kazbrands.utils.basketScreenRoute

@Composable
fun RowScope.HeaderCommon(title: String, navController: NavController) {
    IconButton(onClick = { navController.popBackStack() }) {
        Text(text = "back")
    }
    Box(modifier = Modifier.weight(1f)) {
        Text(text = title, Modifier.fillMaxWidth(), textAlign = TextAlign.Center)
    }
    IconButton(onClick = { /*TODO*/ }) {
        Text(text = "hz")
    }
}

@Composable
fun TopBar(
    visible: Boolean,
    currentRoute: String?,
    navController: NavController
) {
    if (visible) {
        TopAppBar() {
            when (currentRoute) {
                basketScreenRoute -> HeaderCommon("Корзина", navController)
            }
        }
    }
//    val density = LocalDensity.current
//
//    AnimatedVisibility(
//        visible = visible,
//        enter = expandVertically {
//            with(density) { -40.dp.roundToPx() }
//        } + fadeIn(initialAlpha = 0.3f),
//        exit = shrinkVertically  {
//            with(density) { -40.dp.roundToPx() }
//        } + fadeOut(),
//    ) {
//        TopAppBar() {
//
//        }
//    }
}