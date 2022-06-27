package com.example.kazbrands.presentation.profile

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.example.kazbrands.utils.profileScreenRoute
import com.ramcosta.composedestinations.annotation.Destination

@Destination(route = profileScreenRoute)
@Composable
fun ProfileScreen() {
    Box(modifier = Modifier.fillMaxSize()) {
        Text("Профиль", Modifier.align(Alignment.Center))
    }
}