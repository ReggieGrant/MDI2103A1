package com.example.mdi2103a1

// CHALLENGE 1
data class BakeryItem(
    val name: String,
    val sold: Double,
    val price: Double,
) {
    // CHALLENGE 2
    fun revenue(): Double {
        return sold * price
    }
}
