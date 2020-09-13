package com.newbie.behavioral.strategy;

public class Sleeping implements Activity{
    @Override
    public void justDoIt() {
        System.out.println("Do not disturb. I'm sleep. )))");
    }
}
