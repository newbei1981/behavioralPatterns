package com.newbie.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class JobSite implements Observed{
    List<String> vacancies = new ArrayList<>();

    List<Observer> subscribers = new ArrayList<>();

    public void addVacancies(String vacancy){
        this.vacancies.add(vacancy);
        notifyObservers();
    }

    public void deleteVacancies(String vacancy){
        this.vacancies.remove(vacancy);
        notifyObservers();
    }

    @Override
    public void addObserver(Observer observer) {
        this.subscribers.add(observer);
    }

    @Override
    public void deleteObserver(Observer observer) {
        this.subscribers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer:subscribers){
            observer.handleEvent(this.vacancies);
        }
    }
}
