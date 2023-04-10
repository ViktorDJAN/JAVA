package org.example.OOP.seminar.seminar_2.task_3;

import org.example.OOP.seminar.seminar_2.task_2.Actor;
import org.example.OOP.seminar.seminar_2.task_2.Human;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Market implements QueueBehavior, MarketBehavior {
    List<Actor> list = new ArrayList<>();
    Queue<Actor> list2 = new LinkedList<>();

    @Override
    public void releaseFromMarket(Human actor) {
        list.remove(actor);
    }

    @Override
    public void update() {

    }

    @Override
    public void acceptToMarket(Human actor) {
         list.add(actor);
    }

    @Override
    public void takeLnQueue(Human actor) {
         list2.add(actor);
    }

    @Override
    public void takeOrders(Human actor) {
        list2.peek().setTakeOrder();
    }

    @Override
    public void giveOrders(Human actor) {
         list2.peek().setMakeOrder();
    }

    @Override
    public void releaseFromQueue(Human actor) {
        list2.poll();
    }
}