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
public class Rectangle extends Shape{

    protected double a;
    protected double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double calculatePerimeter() {
        return (a+b)*2;
    }

    public double calculateArea() {
        return a*b;
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
