package org.example.OOP.homework.homework_1.task_1;

public class Bavarege {
    private  String name;
    private Double price;

    @Override
    public String toString() {
        return
                "name = " + name + '\'' +
                ", price = " + price + " ";
    }

    public String getName() {
        return name;
    }
    public void showInfo(){
        System.out.println();
    }

    public Bavarege(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }


}
