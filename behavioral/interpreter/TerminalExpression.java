package com.newbie.behavioral.interpreter;

public class TerminalExpression implements Expression{
    private String data;

    public TerminalExpression(String data) {
        this.data = data;
    }

    @Override
    public boolean interpret(String text) {
        if (text.contains(data)) return true;
            else return false;
    }
}
