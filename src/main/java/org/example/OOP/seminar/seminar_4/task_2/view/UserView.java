package org.example.OOP.seminar.seminar_4.task_2.view;

import org.example.OOP.seminar.seminar_4.task_2.data.User;

import java.util.List;

public interface UserView<T extends User>{
    void sendOnConsole(List<T> list);
}
