package org.example.OOP.seminar.seminar_2.task_3;

import org.example.OOP.seminar.seminar_2.task_2.Actor;
import org.example.OOP.seminar.seminar_2.task_2.Human;

public interface MarketBehavior {
    void acceptToMarket(Human actor);

    void releaseFromMarket(Human actor);
    void update();
}
