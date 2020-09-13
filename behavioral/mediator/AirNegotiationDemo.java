package com.newbie.behavioral.mediator;

public class AirNegotiationDemo {
    public static void main(String[] args) {
        AirNegotiationBorispol airNegotiations = new AirNegotiationBorispol();
        Participants dispatcher = new Dispatcher(airNegotiations,"Dispatcher Borispol AirPort");

        Participants bort1 = new Plane(airNegotiations,"Boing  113217");
        Participants bort2 = new Plane(airNegotiations,"Tu-154 223216");

        airNegotiations.setDispatcher(dispatcher);
        airNegotiations.setNewPlane(bort1);
        airNegotiations.setNewPlane(bort2);

        bort1.sendMessage("My coordinate 33'33'44/  height : 2000");System.out.println();
        dispatcher.sendMessage("All borts! Storm warning from 21:00 !!!");System.out.println();
        bort2.sendMessage("My coordinate 23'33'47/  height : 3100");System.out.println();

    }
}
