package org.example.OOP.seminar.seminar_2.task_2;

public class Human extends Actor{
    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setMakeOrder() {
        makeOrder = true;
    }
    @Override
    public void setTakeOrder() {
        takeOrder = true;
    }
    @Override
    public boolean isMakeOrder() {
        return false;
    }

    @Override
    public boolean isTakeOrder() {
        return false;
    }
}
