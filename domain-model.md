# Exercise


```
As a supermarket shopper,
So that I can pay for products at checkout,
I'd like to be able to know the total cost of items in my basket.
```

| Classes   | Members                          | Methods     | Scenario                                       | Outputs                                  |
|-----------|----------------------------------|-------------|------------------------------------------------|------------------------------------------|
| `Basket`  | `HashMap<String, Integer> items` | `getCost()` | Calculate the cost of all items in the basket  | Return the cost of my basket as a float  |

The Basket class will contain a HashMap<String, int> called basket that will hold the item name and its cost in pence.

The getCost() method will iterate through the HashMap totalling up the items and return the total divided by 100.0.f


```
As an organised individual,
So that I can evaluate my shopping habits,
I'd like to see an itemised receipt that includes the name and price of the products
I bought as well as the quantity, and a total cost of my basket.
```

| Classes   | Members                          | Methods         | Scenario                                                                          | Outputs                                                                                                             |
|-----------|----------------------------------|-----------------|-----------------------------------------------------------------------------------|---------------------------------------------------------------------------------------------------------------------|
| `Basket`  | `HashMap<String, Integer> items` | `getCost()`     | Calculate the cost of all items in the basket                                     | Return the cost of my basket as a float                                                                             |
|           |                                  | `getReceipt()`  | Build a nicely formatted string with the contents of the HashMap and `getCost()`  | Return a nicely formatted String containing the contents of the HashMap nicely formatted  along with the full cost. |

