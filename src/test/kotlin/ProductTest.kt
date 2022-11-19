import io.kotlintest.shouldBe
import org.junit.jupiter.api.Test

class ProductTest {

    @Test
    fun `total price for quantity 5 is 5 times the price`() {
        val product = Product("", 10.0, 5)

        val totalPrice = product.totalPrice()

        totalPrice shouldBe 50.0
    }

    @Test
    fun `total price for quantity 1 is the same as price`() {
        val product = Product("", 10.0, 1)

        val totalPrice = product.totalPrice()

        totalPrice shouldBe 10.0
    }

    @Test
    fun `totalPrice for two different products is sum of price`() {
        val product1 = Product("", 10.0, 1)
        val product2 = Product("", 20.0, 1)

        val totalPrice = listOf(product1, product2).totalPrice()

        totalPrice shouldBe 30.0
    }

    @Test
    fun `totalPrice for two different products with multiple quantity is sum of price`() {
        val product1 = Product("", 10.0, 2)
        val product2 = Product("", 20.0, 3)

        val totalPrice = listOf(product1, product2).totalPrice()

        totalPrice shouldBe 80.0
    }
}