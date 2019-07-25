package com.zz.decorator;

public class StarbuzzCoffee {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        Beverage beverage2 = new Mocha(beverage);
        System.out.println(beverage2.getDescription() + " $" + beverage2.cost());
    }
}
