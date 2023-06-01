package com.coffee.computed;

import java.util.ArrayList;
import java.util.List;

public class CupOfCoffee {
    Caffeine caffeine;
    Size size;
    Milk milk;
    List<Topping> toppings = new ArrayList<>();

    public CupOfCoffee(Caffeine caffeine, Size size, Milk milk) {
        this.caffeine = caffeine;
        this.size = size;
        this.milk = milk;
    }

    public void addTopping(Topping topping) {
        toppings.add(topping);
    }

    @Override
    public String toString() {
        return "CupOfCoffee{"
                + caffeine +
                ", " + size +
                ", " + milk +
                ", toppings=" + toppings +
                '}';
    }

    double getPrice() {
        double price = 0.00;

        // Get base price based on size
        switch (size) {
            case SMALL -> price = 5.00;
            case MEDIUM -> price = 6.00;
            case LARGE -> price = 7.00;
        }

        // Add toppings
        for (Topping t : toppings) {
            price += t.getPrice();
        }

        // Discount for no milk
        if (milk == Milk.NONE) {
            price -= .50;
        }
        return price;
    }
}
