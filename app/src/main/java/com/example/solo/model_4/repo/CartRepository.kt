package com.example.solo.model_4.repo

import com.example.solo.model_4.RetrofitClient
import com.example.solo.model_4.model.CartResponse

class CartRepository {

    suspend fun fetchCarts(): CartResponse {

        return RetrofitClient.api.getPosts()

    }
}