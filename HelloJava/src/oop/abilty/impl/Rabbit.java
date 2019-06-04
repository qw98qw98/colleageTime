/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop.abilty.impl;

import oop.abilty.Vegetarian;

/**
 *
 * @author Administrator
 */
public class Rabbit implements Vegetarian {

    @Override
    public void eat() {
        System.out.println("Rabbits eat green grass");
    }

}
