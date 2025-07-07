package model;

import model.Person;

public class Student implements Talkable {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    @Override
    public void speak() {
        System.out.println(name + " says: I'm studying Java.");
    }
}