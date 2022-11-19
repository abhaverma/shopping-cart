data class Product(val name: String, val price: Double, val quantity: Int) {
    fun totalPrice(): Double {
        return price * quantity
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Product

        if (name != other.name) return false
        if (price != other.price) return false

        return true
    }

    override fun hashCode(): Int {
        var result = name.hashCode()
        result = 31 * result + price.hashCode()
        return result
    }
}

fun List<Product>.totalPrice() = sumOf { it.totalPrice() }