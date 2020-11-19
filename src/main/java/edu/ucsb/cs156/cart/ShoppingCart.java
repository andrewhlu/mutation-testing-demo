package edu.ucsb.cs156.cart;

import java.util.ArrayList;

public class ShoppingCart {
    private ArrayList<Item> items;

    public ShoppingCart() {
        items = new ArrayList<Item>();
    }

    public void addItem(Item i) {
        items.add(i);
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public int getPrice() {
        int price = 0;

        for (int i = 0; i < items.size(); i++) {
            price += items.get(i).getPrice();
        }

        return price;
    }

    public int getPriceWithDiscount() {
        int price = getPrice();

        if (price >= 50 && price < 100) {
            return price - 5;
        } else if (price >= 100) {
            return price - 15;
        }

        return price;
    }

    @Override
    public String toString() {
        String s = "Your Cart: ";

        for (int i = 0; i < items.size(); i++) {
            s += items.get(i).toString();
        }

        return s;
    }
}
