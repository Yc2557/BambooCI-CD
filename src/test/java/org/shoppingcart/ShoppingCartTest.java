package org.shoppingcart;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShoppingCartTest {

    private ShoppingCart shoppingCart;

    @BeforeEach
    void setUp() {
        shoppingCart = new ShoppingCart();
    }

    @Test
    void shoppingCartLoginTest() {
        assertFalse(shoppingCart.getIsLoggedIn());

        shoppingCart.login();
        assertTrue(shoppingCart.getIsLoggedIn());

        shoppingCart.logout();
        assertFalse(shoppingCart.getIsLoggedIn());
    }

    @Test
    void shoppingCartCartSumTest() {
        assertEquals(shoppingCart.calculateTotalPrice(), 0);

        shoppingCart.addItem(new Item(1, "Apple", 5, 3));
        shoppingCart.addItem(new Item(1, "Pear", 2.5, 7));
        shoppingCart.addItem(new Item(1, "Orange", 9, 2));

        assertEquals(shoppingCart.calculateTotalPrice(), 48.75);
    }

}