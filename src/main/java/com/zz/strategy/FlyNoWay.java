package com.zz.strategy;

public class FlyNoWay implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("i'm no fly");
    }
}
