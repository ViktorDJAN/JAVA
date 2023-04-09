package org.example.OOP.seminar.seminar_1.task_2;

public class Cat {
     private String name;
     private int age;

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
        this.age = age;
    }

    public void say(){
         System.out.println(name);
     }

}
