package pe.edu.upc.easyvet.presentation.navigation

import pe.edu.upc.easyvet.R

enum class MainTab (
    val label: String,
    val resourceId: Int
){
    Home(
        label = "Home",
        resourceId = R.drawable.home
    ),
    Favorites(
        label = "Favorites",
        resourceId = R.drawable.favorite
    ),
    Cart(
        label = "Cart",
        resourceId = R.drawable.shopping_cart
    ),
    Person(
        label = "Person",
        resourceId = R.drawable.person
    )
}