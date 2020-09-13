package com.newbie.behavioral.interpreter;

public class DemoInterpreter {

    public static void main(String[] args) {
        Expression isJava = isJavaCoreKnowledge();
        Expression isSpring = isJavaEEKnowledge();

        System.out.println("Developer know Java Core : " + isJava.interpret("Java Core"));
        System.out.println("Developer know Java EE   : " + isSpring.interpret("Java Spring"));
    }

    public static Expression isJavaCoreKnowledge(){
        Expression java = new TerminalExpression("Java");
        Expression javaCore = new TerminalExpression("Java Core");

        return new OrExpression(java, javaCore);
    }

    public static Expression isJavaEEKnowledge(){
        Expression java = new TerminalExpression("Java");
        Expression ee = new TerminalExpression("Spring");

        return new AndExpression(java, ee);
    }
}
