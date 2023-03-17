package com.booleanuk.core;

import java.util.HashMap;

public class Basket {
    HashMap<String, Integer> items = new HashMap<>();

    public boolean add(String item, int price) {
        if (items.containsKey(item)) {
            return false;
        } else {
            items.put(item, price);
            return true;
        }
    }

    public int total() {
        int cost = 0;
        for (int price : items.values()) {
            cost += price;
        }
        return cost;
    }
}
