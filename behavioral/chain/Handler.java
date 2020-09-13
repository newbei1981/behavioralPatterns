package com.newbie.behavioral.chain;

public abstract class Handler {
    private int levelOfQualifications;
    private Handler nextHandler;

    public Handler(int levelOfQualifications) {
        this.levelOfQualifications = levelOfQualifications;
    }

    public void setNextHandler(Handler nextHandler){
        this.nextHandler = nextHandler;
    }

    public void handlerManager(String message, int qualifications){
        if (qualifications >= levelOfQualifications)
            write(message);
        if (nextHandler != null) nextHandler.handlerManager(message, qualifications);
    }

    public abstract void write(String message);
}
