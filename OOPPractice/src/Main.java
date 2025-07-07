import model.AbstractPerson;
import model.Person;
import model.Student;
import model.Talkable;
import model.Robot;
import service.PersonService;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Talkable s = new Student("Alice");
        Talkable r = new Robot("X100");

        s.speak(); // Alice says: I'm studying Java.
        r.speak(); // Robot X100 says: Beep boop.
    }
}