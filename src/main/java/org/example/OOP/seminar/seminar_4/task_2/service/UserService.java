package org.example.OOP.seminar.seminar_4.task_2.service;

import java.time.LocalDate;
import java.util.List;

public interface UserService<T> {
    List<T> getAll();

    void create(String firstName, String secondName, String patronymic, String dateOfBirth);
}
