/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop.abilty.impl;

import oop.abilty.Carnivorous;

/**
 *
 * @author Administrator
 */
public class Tiger implements Carnivorous {

    @Override
    public void eat() {
        System.out.println("Tigers eat small animals");
    }

}
