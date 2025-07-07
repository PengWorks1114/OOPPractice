package model;

import model.Person;

// Student 類別繼承 Person，會自動擁有 name、age、introduce()
public class Student extends AbstractPerson {
    private String school;

    public Student(String name, String school) {
        super(name); // 呼叫父類別的建構子
        this.school = school;
    }


    @Override
    public void introduce() {
        System.out.println("I'm a Student: " + getName() + ", from " +  school);
    }
}
