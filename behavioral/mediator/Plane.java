package com.newbie.behavioral.mediator;

public class Plane implements Participants{
    AirNegotiations broadcast;
    String name;

    public Plane(AirNegotiations broadcast, String name) {
        this.broadcast = broadcast;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void sendMessage(String message) {
        broadcast.sendMessage(message, this);
    }

    @Override
    public void getMessage(String message) {
        System.out.println(this.name + "my message " + message);
    }
}
