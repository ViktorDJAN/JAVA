package org.example.java_Introducion.homework.seminar.seminar_6.cw_2.model;

public class Fareingate implements Converter{
    @Override
    public Double convert(Double inputValue) {
        return inputValue * 9/5 + 32;
    }
}
