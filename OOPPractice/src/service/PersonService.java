package service;

import model.Person;

public class PersonService {

    public void birthday(Person person) {
        int currentAge = person.getAge();
        person.setAge(currentAge + 1);
        System.out.println(person.getName() + " is now " + person.getAge() + " years old");
    }
}
//
//✅ 功能說明：
//這是服務類別（Service），專門定義對 Person 的操作，例如：
//幫某個人慶生並更新他的年齡
//public void birthday(Person person)
//代表傳入一個 Person 物件，呼叫它的 getAge() 和 setAge() 來更新年齡，然後印出結果。