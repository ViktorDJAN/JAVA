package org.example.seminar.seminar_6.cw_2;

import org.example.seminar.seminar_6.cw_2.model.Converter;
import org.example.seminar.seminar_6.cw_2.model.Fareingate;

public class cw_2 {
    public static void main(String[] args) {
        Double tCel = 100.0;
        Double tFar = new Fareingate().convert(tCel);
        System.out.println(tFar);
    }
}
