package com.example.solo.model_3

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController

@Composable
fun HomePage(navController: NavController) {
    Box(

        modifier = Modifier
            .fillMaxSize()
    ) {
        Text("Welcom back to the Home Page of the Solo App ")
    }
}


@Composable
@Preview(showBackground = true, showSystemUi = true)
fun HomePagePreview() {
    HomePage(
        navController = rememberNavController()
    )
}