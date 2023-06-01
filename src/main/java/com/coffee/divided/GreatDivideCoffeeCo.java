package com.coffee.divided;

public class GreatDivideCoffeeCo {
    public static void main(String[] args) {

        CupOfCoffee c = new CupOfCoffee(Caffeine.REGULAR, Size.LARGE, Milk.WHOLE);
        c.addTopping(Topping.WHIPPED_CREAM);
        c.addTopping(Topping.UNICORN_FUR);

        printReceipt(c);
    }

    private static void printReceipt(CupOfCoffee c) {
        Printer printer = new Printer();
        Pricer pricer = new Pricer();
        printer.print(c);
        printer.print("TOTAL:  $" + pricer.getPrice(c));
    }
}
