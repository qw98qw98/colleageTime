/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop.shape;

import static java.lang.Double.doubleToLongBits;

/**
 *
 * @author 胡浩然
 */
public class RightTriangle extends Triangle {

    public RightTriangle(double a, double b) {
        super(a, b, Math.sqrt(a * a + b * b));
    }

    @Override
    public double calculateArea() {
        return (a * b) / 2;
    }

    public double calculateChord() {
        return c;
    }

    @Override
    public boolean isIsoscelesTriangle() {
        return (a == b);
    }

    @Override
    public String toString() {
        return "RightTriangle:" + "calculatePerimeter:" + this.calculatePerimeter() + "calculateArea:" + this.calculateArea();
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
