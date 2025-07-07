package model;


public class Robot implements Talkable {
    private String id;

    public Robot(String id) {
        this.id = id;
    }

    @Override
    public void speak() {
        System.out.println("Robot " + id + " says: Beep boop.");
    }
}
