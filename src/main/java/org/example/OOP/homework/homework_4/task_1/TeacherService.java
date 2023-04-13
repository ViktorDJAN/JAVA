package org.example.OOP.homework.homework_4.task_1;

import java.util.ArrayList;

public class TeacherService <T extends Teacher>{
    private ArrayList<T> list1;
    public TeacherService(){
        list1 = new ArrayList<T>();
    }
    public void addTeacher(T newTecher){
        list1.add(newTecher);
    }
    public ArrayList<T> getInfoOfAllTeachers(){
        return list1;
    }
}
