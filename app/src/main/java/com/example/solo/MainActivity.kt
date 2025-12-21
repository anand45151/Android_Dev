package com.example.solo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.solo.model_3.HomePage
import com.example.solo.model_3.LoginPage
import com.example.solo.model_3.Screen
import com.example.solo.model_3.SignUpPage
import com.example.solo.ui.theme.SoloTheme
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            SoloTheme {

                val navController = rememberNavController()

                NavHost(
                    navController = navController,
                    startDestination = Screen.LoginPge.route
                ) {

                    composable(Screen.LoginPge.route) {
                        LoginPage(navController)
                    }

                    composable(Screen.SignUpPage.route) {
                        SignUpPage(navController)
                    }

                    composable(Screen.HomePage.route) {
                        HomePage(navController)
                    }
                }
            }
        }
    }
}
