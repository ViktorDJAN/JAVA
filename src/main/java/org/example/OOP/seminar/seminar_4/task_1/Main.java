package org.example.OOP.seminar.seminar_4.task_1;

/**
 *     GENERIC   пример использования
 */

import org.example.OOP.seminar.seminar_3.task_1.Cat;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("qwe");
        stringList.add("saf23");
        System.out.println(stringList);
        Animal <Cat> catAnimal  = new Animal<>();
        catAnimal.setGeneric(new Cat("sad"));
        Animal<Dog> dogAnimal = new Animal<>();
        dogAnimal.setGeneric(new Dog("JAX","JUMP"));
        System.out.println(catAnimal.info().toString());
        System.out.println(dogAnimal.info().toString());
    }
}
