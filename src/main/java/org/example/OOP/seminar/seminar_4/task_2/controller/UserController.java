package org.example.OOP.seminar.seminar_4.task_2.controller;



import org.example.OOP.seminar.seminar_4.task_2.data.User;

import java.time.LocalDate;

public interface UserController<T extends User>{
    void create(String firstName, String secondName, String patronymic, LocalDate dateOfBirth);

    abstract void create(String firstName, String secondName, String patronymic, String dateOfBirth);
}
