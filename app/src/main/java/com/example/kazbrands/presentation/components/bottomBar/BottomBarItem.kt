package com.example.kazbrands.presentation.components.bottomBar

import androidx.compose.foundation.layout.RowScope
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import com.example.kazbrands.presentation.components.bottomBar.utils.NavBottomBarItem
import com.example.kazbrands.presentation.destinations.DirectionDestination

@Composable
fun RowScope.BottomBarItem(item: NavBottomBarItem, currentRoute: String?, onClick: (DirectionDestination) -> Unit) {
    BottomNavigationItem(
        selected = currentRoute === item.route,
        onClick = { onClick(item.directionDestination) },
        icon = {},
        label = { Text(item.title) }
    )
}