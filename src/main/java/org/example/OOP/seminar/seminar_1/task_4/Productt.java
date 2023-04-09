package org.example.OOP.seminar.seminar_1.task_4;

import org.example.OOP.seminar.seminar_1.task_3.Product;

public abstract class Productt extends Product {
    private String name;
    private Double price;

    public Productt(String name, Double price) {
        super();
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
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
