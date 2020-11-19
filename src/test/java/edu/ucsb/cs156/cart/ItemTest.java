package edu.ucsb.cs156.cart;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ItemTest {
    @Test
    public void test_getName() {
        Item i = new Item("Hoodie", 30);
        assertEquals("Hoodie", i.getName());
    }

    @Test
    public void test_getPrice() {
        Item i = new Item("Hoodie", 30);
        assertEquals(30, i.getPrice());
    }

    @Test
    public void test_toString() {
        Item i = new Item("Hoodie", 30);
        assertEquals("[name: Hoodie, price: 30]", i.toString());
    }
}
