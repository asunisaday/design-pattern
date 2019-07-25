package com.zz.factory;

public class NYStylePizzaStore extends  PizzStore {
    @Override
    Pizza createPizza(String type) {
        if (type.equals("cheese")) {
            return  new NYStyleCheesePizza();
        }
        return null;
    }
}
