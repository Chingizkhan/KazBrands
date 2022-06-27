package com.example.kazbrands.presentation.basket

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.example.kazbrands.presentation.components.button.Button
import com.example.kazbrands.presentation.components.input.Input
import com.example.kazbrands.presentation.components.title.Title
import com.example.kazbrands.presentation.destinations.LoginScreenDestination
import com.example.kazbrands.utils.basketScreenRoute
import com.ramcosta.composedestinations.annotation.Destination
import com.ramcosta.composedestinations.navigation.DestinationsNavigator

@Destination(route = basketScreenRoute)
@Composable
fun BasketScreen(
    navigator: DestinationsNavigator
) {
    Box(modifier = Modifier.fillMaxSize()) {
        Column(Modifier.align(Alignment.Center)) {
            Title("Корзина")
            Text("В корзине пусто.")
            Input(value = "", onValueChange = {}, label = "Salam")
            Text("Войдите в свой аккаунт, чтобы посмотреть корзину.")
            Button(
                onClick = { navigator.navigate(LoginScreenDestination) }
            ) {
                Text("Войти")
            }
        }
    }
}