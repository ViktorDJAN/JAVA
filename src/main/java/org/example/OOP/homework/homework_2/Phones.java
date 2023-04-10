package org.example.OOP.homework.homework_2;

public class Phones extends ElectronicDevice{
    private String model;
    public Phones(String name, Double price, String warrant) {
        super(name, price, warrant);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Phones(String name, Double price, String warrant, String model) {
        super(name, price, warrant);
        this.model = model;
    }
    @Override
    public String toString() {
        return  super.toString() + " model = " + model;

    }
}
