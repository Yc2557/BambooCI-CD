package org.shoppingcart;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private final List<Item> cartItems;
    private boolean isLoggedIn = false;

    public ShoppingCart() {
        cartItems = new ArrayList<>();
    }

    public double calculateTotalPrice() {
        double totalSum = 0;

        for (Item item: cartItems) {
            double sum = item.getPrice() * item.getQuantity();

            if (item.getQuantity() > 5) {
                sum = Math.round((sum * 0.95) * 100.0)/100.0;
            }

            totalSum += sum;
        }
        
        return totalSum;
    }
    
    public void login() {
        isLoggedIn = true;
    }

    public void logout() {
        isLoggedIn = false;
    }

    public void addItem(Item item) {
        cartItems.add(item);
    }

    public boolean getIsLoggedIn() {
        return  isLoggedIn;
    }
}
