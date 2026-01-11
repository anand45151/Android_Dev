package com.example.solo.model_4.viewModel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.solo.model_4.model.Cart
import com.example.solo.model_4.repo.CartRepository
import kotlinx.coroutines.launch
class CartViewModel : ViewModel() {

    private val repository = CartRepository()

    // Use mutableStateOf instead of LiveData
    var uiState by mutableStateOf<List<Cart>>(emptyList())
        private set

    var isLoading by mutableStateOf(false)
        private set

    init {
        loaddata()
    }

    fun loaddata() {
        isLoading = true
        viewModelScope.launch {
            try {
                val response = repository.fetchCarts()
                uiState = response.carts
            } catch (e: Exception) {
                e.printStackTrace()
            } finally {
                isLoading = false
            }
        }
    }
}