package com.example.kazbrands.presentation.favorite

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.example.kazbrands.utils.favoriteScreenRoute
import com.ramcosta.composedestinations.annotation.Destination

@Destination(route = favoriteScreenRoute)
@Composable
fun FavoriteScreen() {
    Box(modifier = Modifier.fillMaxSize()) {
        Text("Избранное", Modifier.align(Alignment.Center))
    }
}