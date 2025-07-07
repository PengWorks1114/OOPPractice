package model;

import model.Person;

// Student 類別繼承 Person，會自動擁有 name、age、introduce()
public class Student extends Person {
    private String school;

    public Student(String name, int age, String school) {
        super(name, age); // 呼叫父類別的建構子
        this.school = school;
    }

    public String getSchool() { return school; }

    public void setSchool(String school) { this.school = school; }

    // 覆寫父類別方法（多型示範，將於第三步詳解）
    @Override
    public void introduce() {
        System.out.println("Hi, I'm " + getName() + ", " + getAge() + " years old, and I study at " + school + ".");
    }
}
