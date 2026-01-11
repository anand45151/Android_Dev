package com.example.solo.model_4.model

data class CartResponse(
    val carts: List<Cart>
)

data class Cart(
    val id: Int,
    val userId: Int,
    val total: Int,
    val discountedTotal: Int,
    val products: List<Product>
)

data class Product(
    val id: Int,
    val title: String,
    val price: Int,
    val quantity: Int,
)
