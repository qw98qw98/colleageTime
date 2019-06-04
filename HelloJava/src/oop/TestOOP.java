/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop;

import java.util.Arrays;
import oop.abilty.impl.Plane;
import oop.abilty.impl.Rabbit;
import oop.abilty.impl.Tiger;
import oop.season.*;
import oop.shape.*;
import oop.util.Utility;

/**
 *
 * @author Administrator
 */
public class TestOOP {

    public static void main(String[] args) {
        testClass();
        testEnum();
        testExtemds();
    }
    public static void testImplements(){
        Tiger tiger=new Tiger();
        Rabbit rabbit =new Rabbit();
        Plane plane=new Plane();
        tiger.eat();
        rabbit.eat();
        plane.fly();
        
        
    }
    public static void testEnum() {
        for (Season season : Season.values()) {
            System.out.print(season + " -- ");
            switch (season) {
                case SPRING:
                    System.out.println("春光明媚。");
                    break;
                case SUMMER:
                    System.out.println("夏日炎炎。");
                    break;
                case AUTUMN:
                    System.out.println("秋高气爽。");
                    break;
                case WINTER:
                    System.out.println("冬山如睡。");
                    break;
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
        System.out.println("Primeter of circle =" + circle.calculatePerimeter());
        System.out.println("Area of circle =" + circle.calculateArea());
        System.out.println("Primeter of triangle =" + triangle.calculatePerimeter());
        System.out.println("Area of triangle =" + triangle.calculateArea());
        System.out.println("Primeter of rectangle =" + rectangle.calculatePerimeter());
        System.out.println("Area of rectangle =" + rectangle.calculateArea());

    }

    public static void testCombination() {
        Cylinder cylinder = new Cylinder(10, 20);
        System.out.println(cylinder);
        System.out.println(cylinder.calculateSurfaceArea());
        System.out.println(cylinder.calculateVolume());
    }

    public static void testExtemds() {
        Circle circle = new Circle(Shape.UNIT);
        RightTriangle rtriangle = new RightTriangle(Shape.UNIT, Shape.UNIT);
        Square square = new Square(Shape.UNIT);

        System.out.println("circle = " + circle);
        System.out.println("chord of rtriangle = " + rtriangle.calculateChord());
        System.out.println("Isosceles triangle = " + rtriangle.isIsoscelesTriangle());
        Shape shape;//新建一个爸爸
        shape = circle;//把儿子赋给爸爸无需强制类型转换 泛型思想
        System.out.println("shape = " + shape);
        shape = square;//把儿子赋给爸爸
        System.out.println("shape = " + shape);
        shape = rtriangle;//把儿子赋给爸爸
        System.out.println("shape = " + shape);
        System.out.println("area of shape = " + shape.calculateArea());//爸爸拥有计算面积和周长的方法
        //System.out.println("chord from shape = " (new Righttriangle()=(RightTriangle)shape).calculateChord());//爸爸没有计算Chora的方法，儿子有也没有用
        rtriangle = (RightTriangle) shape;//向下转型 需要强制类型转换   shape是RightTriangle类型的
        System.out.println("chord from shape = " + rtriangle.calculateChord());//rtriangle类型拥有calculateChord独特方法
    }

    public static void testOverload() {
        int[] d1 = Utility.randomNumbers(10, 10);
        int[] d2 = Utility.randomNumbers(10, 50, 10);
        double[] d3 = Utility.randomNumbers(3, 10.0);
        System.out.println("d1 = " + Arrays.toString(d1));
        System.out.println("d2 = " + Arrays.toString(d2));
        System.out.println("d3 = " + Arrays.toString(d3));
    }
}
