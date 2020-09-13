package com.newbie.behavioral.strategy;

public class Demo {
    public static void main(String[] args) {
        Developer developer = new Developer();
        developer.setActivity(new Sleeping());
        developer.executeActivity();

        developer.setActivity(new Reading());
        developer.executeActivity();

        developer.setActivity(new Codding());
        developer.executeActivity();

        developer.setActivity(new PlayFootball());
        developer.executeActivity();
    }
}
