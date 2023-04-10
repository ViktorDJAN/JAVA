package org.example.OOP.seminar.seminar_2.task_3;

import org.example.OOP.seminar.seminar_2.task_2.Human;

public class MainS2Tsk4 {
    public static void main(String[] args) {
        Human human = new Human();
        Market mac = new Market();
        mac.acceptToMarket(human);
        mac.takeLnQueue(human);
        mac.takeOrders(human);
        mac.giveOrders(human);
        mac.releaseFromQueue(human);
        mac.releaseFromMarket(human);

    }
}
