package service;

import model.Person;

public class PersonService {

    public void birthday(Person person) {
        int currentAge = person.getAge();
        person.setAge(currentAge + 1);
        System.out.println(person.getName() + " is now " + person.getAge() + " years old");
    }
}
