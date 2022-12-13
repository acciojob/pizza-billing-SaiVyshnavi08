package com.driver;

public class DeluxePizza extends Pizza {

    @Override
    public void addExtraCheese() {}

    @Override
    public void addExtraToppings() {}

    public DeluxePizza(Boolean isVeg) {
        super(isVeg);
        // your code goes here
         super.addExtraCheese();
         super.addExtraToppings();
    }
}
