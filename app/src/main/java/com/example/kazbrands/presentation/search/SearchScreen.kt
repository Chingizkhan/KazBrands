package com.example.kazbrands.presentation.search

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.example.kazbrands.utils.searchScreenRoute
import com.ramcosta.composedestinations.annotation.Destination

fun getCategories(): List<String> {
    return listOf("")
}

@Destination(route = searchScreenRoute)
@Composable
fun SearchScreen() {
    Box(modifier = Modifier.fillMaxSize()) {
        Text("Поиск", Modifier.align(Alignment.Center))
    }
}