package org.example.OOP.homework.homework_2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Vitrina implements Iterable<Phones>{
    private ArrayList<Phones> phones;
    public Vitrina(ArrayList<Phones>phones){
        this.phones = phones;
    }

    @Override
    public Iterator<Phones> iterator() {
        return null;
    }
}
