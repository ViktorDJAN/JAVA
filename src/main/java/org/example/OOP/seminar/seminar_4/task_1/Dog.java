package org.example.OOP.seminar.seminar_4.task_1;

public class Dog extends BasikAnimal{
    private String name;
    private String habbit;

    public Dog(String name, String habbit) {
        this.name = name;
        this.habbit = habbit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHabbit() {
        return habbit;
    }

    public void setHabbit(String habbit) {
        this.habbit = habbit;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", habbit='" + habbit + '\'' +
                '}';
    }
}
