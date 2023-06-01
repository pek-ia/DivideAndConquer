package com.coffee.divided;

public class Printer {
    public void print(CupOfCoffee c) {
        System.out.printf("COFFEE: %s\n  %s\n  %s\n",
                c.caffeine, c.size, c.milk);
        System.out.println("Toppings:");
        for (Topping t : c.toppings){
             print(t);

        }
    }

    private void print(Topping t) {
        System.out.println("  " + t);
    }

    public void print(String s) {
        System.out.println(s);
    }
}
