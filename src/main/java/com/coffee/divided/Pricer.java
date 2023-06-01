package com.coffee.divided;

public class Pricer {
    public double getPrice(CupOfCoffee c) {
        double price = 0.00;

        // Get base price based on size
        switch (c.size) {
            case SMALL -> price = 5.00;
            case MEDIUM -> price = 6.00;
            case LARGE -> price = 7.00;
        }

        // Add toppings
        for (Topping t : c.toppings) {
            price += getPrice(t);
        }

        // Discount for no milk
        if (c.milk == Milk.NONE) {
            price -= .50;
        }
        return price;

    }

    private double getPrice(Topping t) {
        double price = 0.00;
        switch(t){
            case CARAMEL_SYRUP, SPRINKLES -> price = 1.00;
            case UNICORN_FUR -> price = 175.00;
            case WHIPPED_CREAM -> price = 1.50;
            case CHOCOLATE_SYRUP -> price = 2.00;
        }

        return price;
    }
}
