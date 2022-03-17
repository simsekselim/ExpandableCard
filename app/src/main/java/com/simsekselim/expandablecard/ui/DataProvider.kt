package com.simsekselim.expandablecard.ui

import com.simsekselim.expandablecard.R

data class MenuItem(
   val name: String,
    val unitPrice: Int,
    var isSelected: Boolean = false
)

object DataProvider {

    val coffeeMenu = listOf(
        MenuItem("Espresso", unitPrice = 3),
        MenuItem("Double Espresso", unitPrice = 4),
        MenuItem("Americano", unitPrice = 4),
        MenuItem("Macchiato", unitPrice = 5),
        MenuItem("Caramel Macchiato", unitPrice = 5),
        MenuItem("Ristretto", unitPrice = 3),
        MenuItem("Latte", unitPrice = 5),
        MenuItem("Cappuchino", unitPrice = 5),
        MenuItem("Mocha", unitPrice = 5)
    )

}