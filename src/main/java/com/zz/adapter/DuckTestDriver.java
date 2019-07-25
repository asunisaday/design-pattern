package com.zz.adapter;

public class DuckTestDriver {

    public static void main(String[] args) {
        MallardDuck duck = new MallardDuck();

        Turkey turkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(turkey);


    }
}
