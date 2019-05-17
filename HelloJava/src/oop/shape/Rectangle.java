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

    @Override
    public double calculatePerimeter() {
        return (a+b)*2;
    }

    @Override
    public double calculateArea() {
        return a*b;
    }
     @Override
    public String toString(){
        return "Rectangle:"+"calculatePerimeter:"+this.calculatePerimeter()+"calculateArea:"+this.calculateArea();
    }
    @Override
    public int hashCode(){
       long f=doubleToLongBits(this.calculateArea());
        return (int)(f^(f>>32));
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
