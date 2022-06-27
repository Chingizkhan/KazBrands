package com.example.kazbrands.presentation.components.layout

import androidx.compose.runtime.Composable
import com.example.kazbrands.utils.*

@Composable
fun setLayoutListeners(
    currentRoute: String?,
    setTopBarState: (Boolean) -> Unit,
    setBottomBarState: (Boolean) -> Unit,
    setDrawerGestureState: (Boolean) -> Unit
) {
    fun showAll() {
        setTopBarState(true)
        setBottomBarState(true)
        setDrawerGestureState(true)
    }

    fun hideAll() {
        setTopBarState(false)
        setBottomBarState(false)
        setDrawerGestureState(false)
    }

    when (currentRoute) {
        mainScreenRoute -> showAll()
        searchScreenRoute -> showAll()
        basketScreenRoute -> showAll()
        favoriteScreenRoute -> showAll()
        profileScreenRoute -> showAll()
        loginScreenRoute -> hideAll()
    }
}