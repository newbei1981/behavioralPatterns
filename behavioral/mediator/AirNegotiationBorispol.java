package com.newbie.behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

public class AirNegotiationBorispol implements AirNegotiations{
    Participants dispatcher;
    List<Participants> plans = new ArrayList<>();

    public void setDispatcher(Participants dispatcher) {
        this.dispatcher = dispatcher;
    }

    public void setNewPlane(Participants plane){
        plans.add(plane);
    }

    @Override
    public void sendMessage(String message, Participants participants) {
        for(Participants p:plans){
            if(p!=participants)
                p.getMessage(message);
        }
        dispatcher.getMessage(message);
    }
}
