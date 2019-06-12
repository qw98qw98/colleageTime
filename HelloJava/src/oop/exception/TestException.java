/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop.exception;

/**
 *
 * @author 胡浩然
 */
public class TestException {
    public static void main(String[] args) {
        try {
            String s = 123;
            int d = Integer.parseInt(s);
            System.out.println("d = " + d);
        } catch (RuntimeException ex) {
            System.out.println("输入异常");
        }
    }
}
