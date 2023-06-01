package com.coffee.tendollar;

public class TenDollarCoffeeCo {
    public static void main(String[] args) {

        CupOfCoffee c = new CupOfCoffee(Caffeine.REGULAR, Size.LARGE, Milk.WHOLE);
        c.addTopping(Topping.WHIPPED_CREAM);
        c.addTopping(Topping.UNICORN_FUR);

        printReceipt(c);
    }

    private static void printReceipt(CupOfCoffee c) {
        System.out.println("YOUR ORDER");
        System.out.println("==========");
        System.out.println(c);
        System.out.println("TOTAL:  $10.00");
    }
}
