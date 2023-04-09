package org.example.OOP.seminar.seminar_1.task_4;

public class Cips extends Productt{
    private  Integer salt;

    public Integer getSalt() {
        return salt;
    }

    public void setSalt(Integer salt) {
        this.salt = salt;
    }

    public Cips(String name, double cost) {
        super(name, cost);
    }

    public Cips(String name, double cost, Integer salt) {
        super(name, cost);
        this.salt = salt;
    }
}
