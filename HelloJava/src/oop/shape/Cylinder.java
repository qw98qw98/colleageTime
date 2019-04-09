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
public class Cylinder {
    private Circle bottom;
    private double height;
    public Cylinder(Circle C,double D){
        bottom=C;
        height=D;
    }    
    public Cylinder(double C,double D){
        bottom.setR(C);
        height=D;
    }

    public Circle getBottom() {
        return bottom;
    }

    public void setBottom(Circle bottom) {
        this.bottom = bottom;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double calculateSurfaceArea(){
        return bottom.calculatePerimeter()*getHeight();
    }
    public double calculateVolume(){
        return bottom.calculatePerimeter()*getHeight();
    }
    
}
