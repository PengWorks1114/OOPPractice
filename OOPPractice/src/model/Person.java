package model;

    //Person 類別:練習封裝
    //
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

    //可被子類覆寫的行為
    public void introduce() {
//        System.out.println("Hi, I'm" + name + "and I'm" + age + "years old.");
        System.out.println("I'm a person: " + name);
    }
    }

//✅ 功能說明：
//這是我們的 資料類別（Model），代表一個人，封裝了：
//
//屬性（name、age）
//
//方法（get/set、introduce()）
//
//✅ 重點概念（封裝 Encapsulation）：
//private 屬性保護資料，不讓外部直接修改
//
//public 的 Getter/Setter 提供安全的資料讀寫方式
//
//introduce() 是一種行為（方法），會印出自我介紹