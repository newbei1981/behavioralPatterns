package com.newbie.behavioral.chain;

public class MiddleQuestion extends Handler{

    public MiddleQuestion(int levelOfQualifications) {
        super(levelOfQualifications);
    }

    @Override
    public void write(String message) {
        System.out.println("Sorry fore waiting ! How can i help you ? Your question : " + message);
    }
}
