import io.kotlintest.shouldBe
import org.junit.jupiter.api.Test

class ShoppingCartTest {

    @Test
    fun `total price is zero for empty shopping cart`() {
        val shoppingCart = ShoppingCart()

        val totalPrice = shoppingCart.totalPrice()

        totalPrice shouldBe 0.0
    }

    @Test
    fun `total price is the price of one dove soap`() {
        val shoppingCart = ShoppingCart()
        shoppingCart.addProduct(Product("dove", 39.99, 1))

        val totalPrice = shoppingCart.totalPrice()

        totalPrice shouldBe 39.99
    }

    @Test
    fun `total price equals 199dot95 for 5 dove soaps`() {
        val shoppingCart = ShoppingCart()
        shoppingCart.addProduct(Product("dove", 39.99, 5))

        val totalPrice = shoppingCart.totalPrice()

        totalPrice shouldBe 199.95
    }

    @Test
    fun `total price equals 319dot92 when 5 doves soaps added to cart followed by 3 dove soaps`() {
        val shoppingCart = ShoppingCart()
        shoppingCart.addProduct(Product("dove", 39.99, 5))
        shoppingCart.addProduct(Product("dove", 39.99, 3))

        val totalPrice = shoppingCart.totalPrice()

        totalPrice shouldBe 319.92
    }

    @Test
    fun `total price equals 139dot98 when one dove soap and one axe deo added to cart`() {
        val shoppingCart = ShoppingCart()
        shoppingCart.addProduct(Product("dove", 39.99, 1))
        shoppingCart.addProduct(Product("axe deo", 99.99, 1))

        val totalPrice = shoppingCart.totalPrice()

        totalPrice shouldBe 139.98
    }

    @Test
    fun `total price equals 379dot95 when two dove soap and three axe deo added to cart`() {
        val shoppingCart = ShoppingCart()
        shoppingCart.addProduct(Product("dove", 39.99, 2))
        shoppingCart.addProduct(Product("axe deo", 99.99, 3))

        val totalPrice = shoppingCart.totalPrice()

        totalPrice shouldBe 379.95
    }
}