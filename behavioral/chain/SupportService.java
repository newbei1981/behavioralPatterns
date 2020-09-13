package com.newbie.behavioral.chain;

public class SupportService {

    public static void main(String[] args) {
        Handler simple = new SimpleQuestion(LevelOfQualification.ANSWERING_MACHINE);
        Handler middle = new MiddleQuestion(LevelOfQualification.OPERATOR);
        Handler difficult = new DifficultQuestion(LevelOfQualification.DUTY_ENGINEER);

        simple.setNextHandler(middle);
        middle.setNextHandler(difficult);

        simple.handlerManager("My router is not working! ", LevelOfQualification.ANSWERING_MACHINE);
        simple.handlerManager("My router is hasn't indicate! ", LevelOfQualification.OPERATOR);
        simple.handlerManager("My router is toking with me!? ", LevelOfQualification.DUTY_ENGINEER);

    }
}
