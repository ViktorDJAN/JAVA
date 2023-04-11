package org.example.OOP.seminar.seminar_3.task_1;

import java.util.Iterator;
import java.util.List;

public class CatShelter implements Iterable <Cat>{
    private List<Cat> cats;
    public CatShelter(List<Cat> cats){
        this.cats = cats;
    }

    @Override
    public Iterator<Cat> iterator() {
        return null;
    }
}
