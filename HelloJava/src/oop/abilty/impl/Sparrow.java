/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop.abilty.impl;

import oop.abilty.EatableWithFlyable;

/**
 *
 * @author Administrator
 */
public class Sparrow implements EatableWithFlyable {

    @Override
    public void eat() {
        System.out.println("Sparrows eat worms,grains sand others.");
    }

    @Override
    public void fly() {
        System.out.println("Sparrows fly by themselves.");
    }

}
