import model.Person;
import model.Student;
import service.PersonService;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //建立一個Person物件
        Person p = new Person("Alice", 25);
        p.introduce();// Hi, I'm Alice and I'm 25 years old.

        Student s = new Student("Bob", 20, "Tokyo University");
        s.introduce(); // Hi, I'm Bob, 20 years old, and I study at Tokyo University.

        //呼叫服務類別
        PersonService service = new PersonService();
        service.birthday(p);//Alice is now 26 years old
    }
}

//
//        Main.java ──→ 建立 Person 對象
//         └──→ 呼叫 PersonService 對象
//                 └──→ 操作 Person 對象的資料
//✅ 功能說明：
//        這是主程式，也是整個專案的進入點（entry point），負責：
//
//        建立 Person 物件
//
//        呼叫 introduce() → 自我介紹
//
//        建立 PersonService 物件
//
//        呼叫 birthday(p) → 幫 p（Person）加一歲