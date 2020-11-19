package edu.ucsb.cs156.cart;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShoppingCartTest {
    @Test
    public void test_addItems() {
        Item i1 = new Item("Hoodie", 30);
        Item i2 = new Item("T-Shirt", 15);

        ShoppingCart c = new ShoppingCart();
        c.addItem(i1);
        c.addItem(i2);

        assertEquals(2, c.getItems().size());
        assertEquals("Hoodie", c.getItems().get(0).getName());
        assertEquals("T-Shirt", c.getItems().get(1).getName());
    }

    @Test
    public void test_getPrice() {
        Item i1 = new Item("Hoodie", 30);
        Item i2 = new Item("T-Shirt", 15);

        ShoppingCart c = new ShoppingCart();
        c.addItem(i1);
        c.addItem(i2);

        assertEquals(45, c.getPrice());
    }

    @Test
    public void test_getPriceWithDiscount_25() {
        Item i1 = new Item("$25 Item", 25);
        ShoppingCart c = new ShoppingCart();
        c.addItem(i1);

        assertEquals(25, c.getPriceWithDiscount());
    }

    @Test
    public void test_getPriceWithDiscount_50() {
        Item i1 = new Item("$50 Item", 50);
        ShoppingCart c = new ShoppingCart();
        c.addItem(i1);

        assertEquals(45, c.getPriceWithDiscount());
    }

    @Test
    public void test_getPriceWithDiscount_75() {
        Item i1 = new Item("$75 Item", 75);
        ShoppingCart c = new ShoppingCart();
        c.addItem(i1);

        assertEquals(70, c.getPriceWithDiscount());
    }

    @Test
    public void test_getPriceWithDiscount_100() {
        Item i1 = new Item("$100 Item", 100);
        ShoppingCart c = new ShoppingCart();
        c.addItem(i1);

        assertEquals(85, c.getPriceWithDiscount());
    }

    @Test
    public void test_getPriceWithDiscount_125() {
        Item i1 = new Item("$125 Item", 125);
        ShoppingCart c = new ShoppingCart();
        c.addItem(i1);

        assertEquals(110, c.getPriceWithDiscount());
    }

    @Test
    public void test_toString() {
        Item i1 = new Item("Hoodie", 30);
        Item i2 = new Item("T-Shirt", 15);

        ShoppingCart c = new ShoppingCart();
        c.addItem(i1);
        c.addItem(i2);

        String expected = "Your Cart: " +
                "[name: Hoodie, price: 30]" +
                "[name: T-Shirt, price: 15]";

        assertEquals(expected, c.toString());
    }
}
