package model;

public class Teacher extends AbstractPerson {
    private String subject;

    public Teacher(String name, String subject) {
        super(name);
        this.subject = subject;
    }

    @Override
    public void introduce() {
        System.out.println("I'm a teacher: " + getName() + ", teaching " +  subject);
    }
}
