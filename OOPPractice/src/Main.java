import model.Person;
import service.PersonService;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //建立一個Person物件
        Person p = new Person("Alice", 25);
        p.introduce();// Hi, I'm Alice and I'm 25 years old.

        //呼叫服務類別
        PersonService service = new PersonService();
        service.birthday(p);//Alice is now 26 years old
    }
}