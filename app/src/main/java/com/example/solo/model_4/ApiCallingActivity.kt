package com.example.solo.model_4

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.solo.model_4.model.Cart
import com.example.solo.model_4.model.Product
import com.example.solo.model_4.ui.theme.SoloTheme
import com.example.solo.model_4.viewModel.CartViewModel
import androidx.compose.foundation.lazy.items
import kotlin.Int

class ApiCallingActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            SoloTheme {
                CartScreen()


            }
        }
    }
}


@Composable
fun CartItem(cart: Cart) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp),
        shape = RoundedCornerShape(12.dp)
    ) {
        Column(modifier = Modifier.padding(16.dp)) {

            Text(
                text = "Cart ID: ${cart.id}",
                style = MaterialTheme.typography.titleMedium
            )

            Text(text = "User ID: ${cart.userId}")
            Text(text = "Total: ₹${cart.total}")
            Text(text = "Discounted: ₹${cart.discountedTotal}")

            Spacer(modifier = Modifier.height(8.dp))

            Text(
                text = "Products: ${cart.products.size}",
                style = MaterialTheme.typography.bodyMedium
            )
        }
    }
}

@Composable
fun CartScreen(viewModel: CartViewModel = viewModel()) {
    val carts = viewModel.uiState
    val loading = viewModel.isLoading

    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        if (loading) {
            CircularProgressIndicator()
        } else {
            LazyColumn(
                modifier = Modifier.fillMaxSize()
            ) {
                items(carts) { cart ->
                    CartItem(cart = cart)
                }
            }
        }
    }
}


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun CartScreenPreview2() {
//    CartScreen()
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun CartScreenPreview() {

    val cart = listOf(
        Product(
            id = 1,
            title = "Product 1",
            price = 10,
            quantity = 1221
        ),
        Product(
            id = 1,
            title = "Product 1",
            price = 10,
            quantity = 1221
        ),
        Product(
            id = 1,
            title = "Product 1",
            price = 10,
            quantity = 1221
        ),
        Product(
            id = 1,
            title = "Product 1",
            price = 10,
            quantity = 1221
        )
    )

    CartItem(
        cart = Cart(
            id = 1,
            userId = 1,
            total = 1100,
            discountedTotal = 1000,
            products = cart
        )
    )

}

