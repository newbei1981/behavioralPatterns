package com.newbie.behavioral.chain;

public class DifficultQuestion extends Handler{

    public DifficultQuestion(int levelOfQualifications) {
        super(levelOfQualifications);
    }

    @Override
    public void write(String message) {
        System.out.println(" Hi, I will answer any of your questions : " + message);
    }
}
