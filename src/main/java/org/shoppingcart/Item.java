package org.shoppingcart;

public class Item {
    private final int id;
    private final String itemName;
    private final double price;
    private int quantity;

    public Item(int id, String itemName, double price, int quantity) {
        this.id = id;
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }

    public String getItemName(){
        return itemName;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int newQuantity) {
        quantity = newQuantity;
    }
}
