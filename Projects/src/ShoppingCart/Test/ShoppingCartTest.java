package ShoppingCart.Test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import ShoppingCart.Implementations.Product;
import ShoppingCart.Implementations.ShoppingCart;
import ShoppingCart.Mocks.MockCartObserver;

public class ShoppingCartTest {

    @Test
    public void checkTotalValue_suceeds_WHEN_valid_products_are_registered_THEN_returns_total_value_of_Products_in_the_Cart() {
        //Arrange
        Product productOne = new Product("tennis", 100);
        Product productTwo = new Product("T-shirt", 50);
        Product productThree = new Product("shorts", 70);
        List<Product> listProducts = new ArrayList<Product>();
        listProducts.add(productOne);
        listProducts.add(productTwo);
        listProducts.add(productThree);
        ShoppingCart cart = new ShoppingCart(listProducts);
        int expectedTotalValue = 220;

        //Act
        int actualTotalValue = cart.totalValueOfProductsInTheCart();

        //Assert
        assertEquals(expectedTotalValue, actualTotalValue);
    }
    @Test
    public void checkListenProductAddition() {
        //Arrange
        List<Product> listProducts = new ArrayList<Product>();
        Product productToAdd= new Product("tennis", 100);
        ShoppingCart cart = new ShoppingCart(listProducts);
        MockCartObserver mock = new MockCartObserver();
        cart.addObserver(mock);
        cart.addProduct(productToAdd);
        //Act
        Boolean productIsAddedCorrectly = mock.checkProductAddition("tennis", 100);
        //Assert
        assertEquals(true, productIsAddedCorrectly);
    }
}
