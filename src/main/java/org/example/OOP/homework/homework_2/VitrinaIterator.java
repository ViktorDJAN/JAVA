package org.example.OOP.homework.homework_2;

import java.util.ArrayList;
import java.util.Iterator;

public class VitrinaIterator implements Iterator<Phones> {
    private int counter;
    private ArrayList<Phones> phones;

    public VitrinaIterator(int counter, ArrayList<Phones> phones) {
        this.counter = counter;
        this.phones = phones;
    }

    @Override
    public boolean hasNext() {
        if (counter < phones.size()) {
            return true;
        }
        return false;
    }

    @Override
    public Phones next() {
        if (!hasNext()) {
            return null;
        }
        return phones.get(counter++);
    }
}
