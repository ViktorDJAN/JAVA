package org.example.OOP.homework.homework_4.task_1;

import java.util.ArrayList;
import java.util.List;

public class TeacherView {
    public ArrayList<Teacher>list;
    public TeacherView(){
        list =  new ArrayList<>();

    }
    public ArrayList getAllNames(ArrayList arr){
        ArrayList<Teacher> names = new ArrayList<>();
        for(int i = 0;i<arr.size();i++){
            names.add((Teacher) arr.get(i));
        }
        return names;
    }
}
