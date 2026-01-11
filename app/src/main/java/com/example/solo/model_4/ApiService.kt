package com.example.solo.model_4

import com.example.solo.model_4.model.CartResponse
import retrofit2.http.GET

interface ApiService {
    @GET
    suspend fun getPosts(): CartResponse
}