package org.example.homework.hw_2.task_1;

import org.example.seminar.seminar_2.sem2Vector.Vektor;

public class cw_3 {
    public static void main(String[] args) {
        Vektor vektor1 = new Vektor(1.0,1.0,1.0);
        Vektor vektor2 = new Vektor(1.0,3.0,1.0);
        System.out.println( vektor1);
        System.out.println( vektor2);
        System.out.println("VECTOR1 LENGHT IS = "+ vektor1.lengthVektor());
        System.out.println("VECTOR2 LENGHT IS = "+ vektor2.lengthVektor());
        System.out.println("skalarnoe multypliment =" + vektor1.scalar(vektor2));
        System.out.println("Vektornoe multypliment = " + vektor1.vektorMulty(vektor2));
        System.out.println("cosinus of edge = " + vektor1.CosVektor(vektor2));
        System.out.println("summa = " + vektor1.sumVector(vektor2));
        System.out.println("substrackt = " + vektor1.substrVektor(vektor2));
    }
}
