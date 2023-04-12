package org.example.OOP.seminar.seminar_4.task_2.view;

import org.example.OOP.seminar.seminar_4.task_2.data.Teacher;
import org.example.OOP.seminar.seminar_4.task_2.data.UserComparator;

public class Main {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("QQ2","W2","EE","RR");
        Teacher teacher2 = new Teacher("QQ2","W1","EE","RR");
        UserComparator comparator = new UserComparator();
        System.out.println(comparator.compare(teacher1,teacher2));

    }
}
