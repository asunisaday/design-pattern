package com.zz.factory;

public class PizzTestDriver {
    public static void main(String[] args) {


        PizzStore pizzStore = new NYStylePizzaStore();
        Pizza pizza = pizzStore.orderPizza("cheese");

        System.out.println(pizza.getName());

    }
}
