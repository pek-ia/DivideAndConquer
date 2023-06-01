package com.coffee.tendollar;

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

    public void addTopping(Topping topping){
        toppings.add(topping);
    }

    @Override
    public String toString() {
        return "com.coffee.tendollar.CupOfCoffee{" +
                "caffeine=" + caffeine +
                ", size=" + size +
                ", milk=" + milk +
                ", toppings=" + toppings +
                '}';
    }
}
