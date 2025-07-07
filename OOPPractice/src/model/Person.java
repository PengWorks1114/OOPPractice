package model;

    //Person 類別:練習封裝
public class Person {
    private String name;
    private int age;
//    ❌ 要注意括號位置不搖在這邊; 建構子與方法的宣告寫在類別外面了
//    Java 不允許這樣的寫法，所有方法（包含建構子）都必須寫在類別 {} 的大括號內部


    //建構子
    public Person(String name, int age) {
    this.name = name;
    this.age = age;
    }

    //Getter & Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age >= 0) {
            this.age = age;
        }
    }

    public void introduce() {
        System.out.println("Hi, I'm" + name + "and I'm" + age + "years old.");
    }
    }