package com.example.kazbrands.presentation.components.bottomBar.utils

import com.example.kazbrands.presentation.destinations.*
import com.example.kazbrands.utils.*

sealed class NavBottomBarItem(val route: String, val title: String, val directionDestination: DirectionDestination) {
    class Main: NavBottomBarItem(mainScreenRoute, "Главная", MainScreenDestination())
    class Search: NavBottomBarItem(searchScreenRoute, "Поиск", SearchScreenDestination())
    class Basket: NavBottomBarItem(basketScreenRoute, "Корзина", BasketScreenDestination())
    class Favorite: NavBottomBarItem(favoriteScreenRoute, "Избранное", FavoriteScreenDestination())
    class Profile: NavBottomBarItem(profileScreenRoute, "Профиль", ProfileScreenDestination())
}