package org.example.OOP.seminar.seminar_1.task_1.model;




public class Point2D {
     int x,y;

    /**
     * это конструктор
     * @param valueX значение х
     * @param valueY значение у
     */
    public  Point2D(int valueX,int valueY){
        x= valueX;
        y = valueY;
    }
    public  Point2D(){
        x= 0;
        y = 0;
    }
    public  Point2D(int value){
        x= value;
        y = value;
    }

    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public void setX(int value){
        this.x = value;
    }
    public  void setY(int value){
        this.y = value;
    }
    // если стоит приват то мы не можем вызвать его где то еще в программе , мы можем использовать его
    // только локально здесь7698
    private String getInfo(){
        return String.format("x:%d;y:%d",x,y);

    }
    public static double distance(Point2D a, Point2D b) {
        return Math.sqrt((Math.pow(a.x - b.x, 2) + Math.pow(a.y - b.y, 2)));
    }
    @Override
    public String toString() {
        return getInfo();
    }
}
