package org.example.OOP.seminar.seminar_2.task_3;

import org.example.OOP.seminar.seminar_2.task_2.Actor;
import org.example.OOP.seminar.seminar_2.task_2.Human;

public interface QueueBehavior {
    void acceptToMarket(Human actor);

    void takeLnQueue(Human actor);
    void takeOrders(Human actor);
    void giveOrders(Human actor);
    void releaseFromQueue(Human actor);
}
