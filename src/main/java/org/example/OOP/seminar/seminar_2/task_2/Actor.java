package org.example.OOP.seminar.seminar_2.task_2;

public abstract class Actor implements ActorBehavior{
    protected String name;
    protected boolean makeOrder;
    protected boolean takeOrder;
    public boolean isMakeOrder(){
        return  makeOrder;

    }
    public boolean isTakeOrder(){
        return takeOrder;
    }
    public abstract String getName();
}
