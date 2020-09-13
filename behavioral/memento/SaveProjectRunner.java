package com.newbie.behavioral.memento;

public class SaveProjectRunner {
    public static void main(String[] args) {
        Project project = new Project();
        Repository repository = new Repository();

        System.out.println("Created repository...");
        project.setVersionAndDate("ver.1.0");

        System.out.println(project);

        System.out.println("Save current version to repository!");
        repository.setSave(project.save());

        System.out.println("Update our project to ver.2.0");

        project.setVersionAndDate("ver.2.0");

        System.out.println(project);
        System.out.println("Something went wrong...");
        System.out.println("Rolling  back to ver.1.0");
        project.load(repository.getSave());
        System.out.println(project);



    }
}
