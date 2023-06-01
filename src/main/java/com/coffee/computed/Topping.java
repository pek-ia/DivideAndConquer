package com.coffee.computed;

public enum Topping {
    CARAMEL_SYRUP(1.00),
    UNICORN_FUR(175.00),
    SPRINKLES(1.00),
    WHIPPED_CREAM(1.50),
    CHOCOLATE_SYRUP(2.00);

    double price;

    Topping(double price){
        this.price = price;
    }

    double getPrice(){
        return price;
    }
}
