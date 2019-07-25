package com.zz.factory;

public abstract class PizzStore {

    public Pizza orderPizza(String type) {
        Pizza pizza;
        pizza = createPizza(type);
        return pizza;
    }

    abstract Pizza createPizza(String type);

}
