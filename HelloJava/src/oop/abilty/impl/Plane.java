/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop.abilty.impl;

import oop.abilty.Carnivorous;
import oop.abilty.Flyable;

/**
 *
 * @author Administrator
 */
public class Plane implements Flyable {

    @Override
    public void fly() {
        System.out.println("Planes fly by pilots");
    }

    }
