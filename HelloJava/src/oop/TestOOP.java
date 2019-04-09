/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop;

import oop.shape.Circle;
import oop.shape.Rectangle;
import oop.shape.Triangle;
import oop.season.Season;
import oop.shape.Cylinder;

/**
 *
 * @author Administrator
 */
public class TestOOP {

    public static void main(String[] args) {
        testClass();
        testEnum();
    }
public static void testEnum(){
    for(Season season:Season.values()){
        System.out.print(season+" -- ");
        switch(season){
        case SPRING:System.out.println("春光明媚。"); break;
        case SUMMER:System.out.println("夏日炎炎。");break;
        case AUTUMN:System.out.println("秋高气爽。");break;
        case WINTER:System.out.println("冬山如睡。");break;
        }
    }
}
    public static void testClass() {
        Circle circle = new Circle(10);
        Triangle triangle = new Triangle(3, 4, 5);
        Rectangle rectangle = new Rectangle(5.5, 10);
        System.out.println(circle);
        System.out.println(triangle);
        System.out.println(rectangle);
        System.out.println("Primeter of circle =" + circle.calculatePrimeter());
        System.out.println("Area of circle =" + circle.calculateArea());
        System.out.println("Primeter of triangle =" + triangle.calculatePerimeter());
        System.out.println("Area of triangle =" + triangle.calculateArea());
        System.out.println("Primeter of rectangle =" + rectangle.calculatePerimeter());
        System.out.println("Area of rectangle =" + rectangle.calculateArea());
        
    }
    public static void testCombination(){
      Cylinder cylinder=new Cylinder(10,20);
        System.out.println(cylinder);
        System.out.println(cylinder.calculateSurfaceArea());
        System.out.println(cylinder.calculateVolume());
    }
}
