package org.example.seminar.seminar_2.sem2Vector;

import javax.swing.plaf.PanelUI;

public class Vektor {
    private Double x;
    private Double y;
    private Double z;

    public Vektor(Double x, Double y, Double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Double getX() {
        return x;
    }

    public void setX(Double x) {
        this.x = x;
    }

    public Double getY() {
        return y;
    }

    public void setY(Double y) {
        this.y = y;
    }

    public Double getZ() {
        return z;
    }

    public void setZ(Double z) {
        this.z = z;
    }

    @Override
    public String toString() {
        return "Vektor{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }

    /**
     *
     * @return длина вектора 1
     */
    public double lengthVektor() {
        return Math.sqrt(this.x * this.x + this.y * this.y + this.z * this.z);
    }

    /**
     * @param vektor2  координаты второго вектора
     * vektor2 скалярное произведение
     */
    public double scalar(Vektor vektor2) {
        return this.x * vektor2.x + this.y * vektor2.y + this.z * vektor2.z;

    }

    /**
     *
     * @param vektor2 координаты второго вектора
     * @return веторное произведение
     */
    public Vektor vektorMulty(Vektor vektor2) {
        return new Vektor(this.y * vektor2.z - this.z * vektor2.y,
                          this.z*vektor2.x - this.x*vektor2.z,
                          this.x*vektor2.y - this.y*vektor2.x);
    }

    /**
     *
     * @param vektor2 координаты второго вектора
     * @return cosинус вектора
     */
    public double CosVektor(Vektor vektor2) {
        return scalar(vektor2)/(lengthVektor()*vektor2.lengthVektor());

    }

    public Vektor sumVector(Vektor vektor2) {
        return new Vektor(this.x + vektor2.x,
                          this.y + vektor2.y,
                          this.z + vektor2.z);
    }

    public Vektor substrVektor(Vektor vektor2) {
        return new Vektor(this.x - vektor2.x,
                          this.y - vektor2.y,
                          this.z - vektor2.z);
    }
}