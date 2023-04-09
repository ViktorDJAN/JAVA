package org.example.OOP.seminar.seminar_1.task_6;

public class Animal implements Info {
    public int id;

    public Animal(int id) {

        this.id = id;
    }

    public void sleep(){

        System.out.println("I'm sleeping");
    }
    public void showInfo(){
        System.out.println("It is " + this.id);
    }

}
