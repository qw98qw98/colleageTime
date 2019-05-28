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
public class Triangle extends Shape {

    protected double a;
    protected double b;
    protected double c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setC(double c) {
        this.c = c;
    }

    @Override
    public double calculatePerimeter() {
        return a + b + c;
    }

    @Override
    public double calculateArea() {
        double p = (a + b + c) / 2;
        return Math.sqrt(p * ((p - a) * (p - b) * (p - c)));
    }

    public boolean isIsoscelesTriangle() {
        return (a == b || a == c || b == c);
    }

    @Override
    public String toString() {
        return "Triangle:" + "calculatePerimeter:" + this.calculatePerimeter() + "calculateArea:" + this.calculateArea();
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
