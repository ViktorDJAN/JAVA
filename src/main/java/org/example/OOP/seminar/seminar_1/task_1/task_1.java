package org.example.OOP.seminar.seminar_1.task_1;

import org.example.OOP.seminar.seminar_1.task_1.model.Point2D;

public class task_1 {
    public static void main(String[] args) {
        Point2D a = new Point2D(0, 2);
        System.out.println(a.getY());
        System.out.println(a.getX());
        a.setX(10);
        a.setY(13);
        Point2D b = new Point2D();
        Point2D c = new Point2D(5);
        System.out.println(a.getY());
        System.out.println(a.getX());

        var dis = Point2D.distance(a,b);
        System.out.println(dis);
//        System.out.println(a.getInfo());
//        System.out.println(b.getInfo());
//        System.out.println(c.getInfo());

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
//        System.out.println(distance(a,b));
    }
}
//   расчет дистанции точнее метод с формулой
//    static double distance(Point2D a, Point2D b){
//        return Math.sqrt((Math.pow(a.x - b.x,2)+Math.pow(a.y - b.y,2)));

