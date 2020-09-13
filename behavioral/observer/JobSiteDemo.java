package com.newbie.behavioral.observer;

public class JobSiteDemo {
    public static void main(String[] args) {
        JobSite jobSite = new JobSite();

        jobSite.addVacancies("Junior Java Developer");
        jobSite.addVacancies("Junior Php Developer");
        jobSite.addVacancies("Junior Cpp Developer");
        jobSite.addVacancies("Senior Java Developer");
        jobSite.addVacancies("Senior Php Developer");

        Observer developer1 = new Subscriber("Victor Pupkin");
        Observer developer2 = new Subscriber("Chaka Sobaka");
        jobSite.addObserver(developer1);
        jobSite.addObserver(developer2);

        jobSite.addVacancies("Middle Java Developer" );
        jobSite.deleteVacancies("Senior Java Developer");
    }
}