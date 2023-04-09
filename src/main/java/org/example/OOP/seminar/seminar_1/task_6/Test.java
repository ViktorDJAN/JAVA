package org.example.OOP.seminar.seminar_1.task_6;

public class Test {
    public static void main(String[] args) {
        Info info1 = new Animal(1);
        Info info2 = new Person("bob");
        Animal animal1 = new Animal(2);
        Person person1 = new Person("KISA");
        animal1.showInfo();
        person1.sayHello();
        animal1.sleep();
        info1.showInfo();
        info2.showInfo();

    }
}
