package com.example.kazbrands.presentation.components.bottomBar.utils

fun getBottomBarItems(): List<NavBottomBarItem> {
    return listOf(
        NavBottomBarItem.Main(), NavBottomBarItem.Search(), NavBottomBarItem.Basket(),
        NavBottomBarItem.Favorite(), NavBottomBarItem.Profile())
}