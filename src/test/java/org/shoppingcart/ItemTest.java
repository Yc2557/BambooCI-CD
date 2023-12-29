package org.shoppingcart;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ItemTest {

    private Item item;

    @BeforeEach
    void setUp() {
        item = new Item(1, "Apple", 2.0, 3);
    }

    @Test
    void quantityChangeTest() {
        assertEquals(3, item.getQuantity());

        item.setQuantity(5);
        assertEquals(10, item.getQuantity());
    }
}
