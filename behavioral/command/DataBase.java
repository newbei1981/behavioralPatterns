package com.newbie.behavioral.command;

public class DataBase {
    void select(){
        System.out.println("Selected record.");
    }

    void update(){
        System.out.println("Updated record.");
    }

    void insert(){
        System.out.println("Record inserting !");
    }

    void delete(){
        System.out.println("Record is deleted !");
    }
}
