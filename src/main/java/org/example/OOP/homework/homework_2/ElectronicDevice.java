package org.example.OOP.homework.homework_2;

public class ElectronicDevice {
    private String name;
    private Double price;

    @Override
    public String toString() {
        return     "name = " + name  +
                " price = " + price +
                " warrant = " + warrant ;

    }

    public ElectronicDevice(String name, Double price, String warrant) {
        this.name = name;
        this.price = price;
        this.warrant = warrant;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String warrant;


    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getWarrant() {
        return warrant;
    }

    public void setWarrant(String warrant) {
        this.warrant = warrant;
    }
}
