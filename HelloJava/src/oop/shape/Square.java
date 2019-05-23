/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop.shape;

/**
 *
 * @author 胡浩然
 */
public class Square extends Rectangle {

    public Square(double a) {
        super(a, a);
    }

    @Override
    public String toString() {
        return "Square:" + "calculatePerimeter:" + this.calculatePerimeter() + "calculateArea:" + this.calculateArea();
    }
}
