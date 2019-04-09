/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop.shape;

/**
 *
 * @author Administrator
 */
public class Triangle extends Shape{

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
        return a+b+c;
    }
    @Override
    public double calculateArea() {
        double p=(a+b+c)/2;
        return Math.sqrt(p*((p-a)*(p-b)*(p-c)));
    }

    public boolean isIsoscelesTriangle() {
        return (a==b||a==c||b==c);
    }
     @Override
    public String toString(){
        
    }
    @Override
    public int hashCode(){
        
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
        if (Double.doubleToLongBits(this.r) != Double.doubleToLongBits(other.r)) {
            return false;
        }
        return true;
    }
}
