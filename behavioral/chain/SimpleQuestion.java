package com.newbie.behavioral.chain;

public class SimpleQuestion extends Handler{

    public SimpleQuestion(int levelOfQualifications) {
        super(levelOfQualifications);
    }

    @Override
    public void write(String message) {
        System.out.println("\n" + "To choose a solution to your problem, select one of the " + " \n"
                + "menu items or stay on the line to communicate with the operator. Your question :" + message);
    }
}
