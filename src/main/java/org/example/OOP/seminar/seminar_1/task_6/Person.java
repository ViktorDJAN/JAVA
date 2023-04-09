package org.example.OOP.seminar.seminar_1.task_6;

public class Person implements Info{
    public String name;

    public Person(String name) {
        this.name = name;
    }

    public void sayHello(){
        System.out.println("Hello");
    }
    public void showInfo(){
        System.out.println("Name is " + this.name);
    }
}
