package com.zz.strategy;

public class FlyWithWings implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("i'm flying");
    }
}
