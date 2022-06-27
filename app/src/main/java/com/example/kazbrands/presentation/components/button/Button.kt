package com.example.kazbrands.presentation.components.button

import androidx.compose.runtime.Composable

@Composable
fun Button(onClick: () -> Unit, content: @Composable () -> Unit) {
    androidx.compose.material.Button(onClick = onClick) {
        content()
    }
}