package com.newbie.behavioral.observer;

import java.util.List;

public class Subscriber implements Observer{
    String name;

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void handleEvent(List<String> vacancies) {
        System.out.println(name + " We have changes in our list of vacancies!");
        System.out.println(vacancies);

    }
}
