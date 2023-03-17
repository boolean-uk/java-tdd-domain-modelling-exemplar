package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BasketTest {

    @Test
    public void addNewProduct() {
        Basket myBasket = new Basket();
        boolean result = myBasket.add("Baked Beans", 90);
        Assertions.assertTrue(result);
    }

    @Test
    public void addExistingProduct() {
        Basket myBasket = new Basket();
        boolean result = myBasket.add("Baked Beans", 90);
        result = myBasket.add("Baked Beans", 90);
        Assertions.assertFalse(result);
    }

    @Test
    public void totalShouldBe510() {
        Basket myBasket = new Basket();
        myBasket.add("Baked Beans", 90);
        myBasket.add("Bread", 120);
        myBasket.add("Butter", 300);
        Assertions.assertEquals(510, myBasket.total());
    }

    @Test
    public void totalShouldBe210() {
        Basket myBasket = new Basket();
        myBasket.add("Baked Beans", 90);
        myBasket.add("Bread", 120);
        myBasket.add("Baked Beans", 90);
        myBasket.add("Bread", 120);
        Assertions.assertEquals(210, myBasket.total());
    }


    @Test
    public void totalShouldBe0() {
        Basket myBasket = new Basket();
        Assertions.assertEquals(0, myBasket.total());
    }
}
