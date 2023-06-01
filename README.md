# DivideAndConquer

Three different packages illustrate three different ways of partitioning the responsibilites in a project.  
Each package is a separate realization of simple coffee shop that creates a cup of coffee and prints a receipt.

## com.coffee.tendollar

In the Ten Dollar Coffee Company, all cups of coffee cost ten dollars.  Printing the receipt depends on the CupOfCoffee##toString(), 
which means that the job of formatting the receipt is done in the CupOfCoffee class.

## com.coffee.computed

In the Computed Coffee Company, the CupOfCoffee class is still responsible for formatting the receipt.  In addition, the
Toppings now can compute their own prices.  The CupOfCoffee class also can compute its own price.  Sounds like good OO
code, and it does work.  But the CupOfCoffee class is getting a bit complicated.

## com.coffee.divided

In the Great Divide Coffee Company, two new classes - the Pricer and Printer - handle the jobs of calculating the price of
a cup of coffee, and printing the receipt, respectively.  Pricer has overloaded methods to compute the price of a coffee, the price of a topping, etc.  Printer is similar.

## PLEASE NOTE

In these examples, my biggest concern was NOT encapsulation, so I left a lot of member variables with the default (unnamed) access qualifier.  This allowed other 
classes IN THE SAME PACKAGE to access member variables with the dot notation, rather than by calling getters and setters.  This is not best practice for
production, but it did keep the code easy to read.
