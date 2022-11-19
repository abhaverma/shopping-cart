class ShoppingCart {
    private var products: List<Product> = emptyList()

    fun totalPrice(): Double {
        val priceWithoutRounding = products.totalPrice()

        return roundToTwoDecimal(priceWithoutRounding)
    }


    fun addProduct(product: Product) {
        if (this.products.contains(product)) {
            val modifiedProducts = this.products.map {
                if (it == product) {
                    it.copy(quantity = it.quantity + product.quantity)
                } else  {
                    it
                }
            }
            this.products = modifiedProducts
        } else {
            this.products += product
        }
    }
}


fun roundToTwoDecimal(priceWithoutRounding: Double): Double {
    return Math.round(priceWithoutRounding * 100.0) / 100.0
}