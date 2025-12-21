package com.example.solo.model_3

sealed class Screen(
    val route: String
) {
    object LoginPge : Screen("login_page")
    object SignUpPage : Screen("sign_up_page")
    object HomePage : Screen("home_page")


}
