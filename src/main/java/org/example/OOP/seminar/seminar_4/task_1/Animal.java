package org.example.OOP.seminar.seminar_4.task_1;

import java.util.ArrayList;
import java.util.List;

public class Animal <T> {
    List<String> list1 = new ArrayList();
    private T generic;

    public T getGeneric() {
        return generic;
    }

    public void setGeneric(T generic) {
        this.generic = generic;
    }

    public T info(){

        return generic;
    }
}
