package org.example.OOP.seminar.seminar_1.task_4;

public class Chocolate extends Productt{
    public Integer getSugar() {
        return sugar;
    }

    public void setSugar(Integer sugar) {
        this.sugar = sugar;
    }

    private Integer sugar;
    public Chocolate(String name, Double price) {
        super(name, price);
    }

    public Chocolate(String name, double cost, Integer sugar) {
        super(name, cost);
        this.sugar = sugar;
    }
}
