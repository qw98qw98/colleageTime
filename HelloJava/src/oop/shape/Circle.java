/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop.shape;

import static java.lang.Double.doubleToLongBits;

/**
 *
 * @author Administrator
 */
public class Circle extends Shape {

    private double r;

    public Circle(double r) {
        this.r = r;
    }

    public Circle() {
        r = 1.0;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    @Override
    public double calculatePerimeter() {
        return Math.PI * 2 * r;
    }

    @Override
    public double calculateArea() {
        return Math.PI * r * r;
    }

    @Override
    public String toString() {
        return "Circle：" + "calculatePerimeter:" + this.calculatePerimeter() + "calculateArea:" + this.calculateArea();
    }

    @Override
    public int hashCode() {
        long f = doubleToLongBits(this.calculateArea());
        return (int) (f ^ (f >> 32));
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Circle other = (Circle) obj;
        return Double.doubleToLongBits(this.calculateArea()) == Double.doubleToLongBits(other.calculateArea());
    }
}
