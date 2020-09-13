package com.newbie.behavioral.command;

public class DataBaseDemo {
    public static void main(String[] args) {
        DataBase dataBase = new DataBase();

        Developer developer = new Developer(
                new InsertCommand(dataBase),
                new UpdateCommand(dataBase),
                new SelectCommand(dataBase),
                new DeleteCommand(dataBase)
        );

        developer.insertRecord();
        developer.selectRecord();
        developer.updateRecord();
        developer.deleteRecord();
    }
}
