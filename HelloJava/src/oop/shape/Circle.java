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
public class Circle extends  Shape {
    private  double r;

    public Circle(double r) {
        this.r = r;
    }

    public Circle() {
        r=1.0;
    }

    public double getR() {
        return r;
    }
    public void setR(double r) {
       this.r=r;
    }
    @Override
    public double calculatePerimeter(){
        return Math.PI*2*r;
    }
    @Override
    public double calculateArea(){
        return Math.PI*r*r;
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