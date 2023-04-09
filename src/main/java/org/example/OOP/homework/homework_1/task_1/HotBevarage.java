package org.example.OOP.homework.homework_1.task_1;

public class HotBevarage extends Bavarege {

    private Integer temperature;

    @Override
    public String toString() {
        return  super.toString() + "temperature = " + temperature + " ";
    }

    public Integer getTemperature() {
        return temperature;
    }

    public void setTemperature(Integer temperature) {
        this.temperature = temperature;
    }

    public HotBevarage(String name, Double price) {
        super(name, price);
    }

    public HotBevarage(String name, Double price, Integer temperature) {
        super(name, price);
        this.temperature = temperature;
    }


}

