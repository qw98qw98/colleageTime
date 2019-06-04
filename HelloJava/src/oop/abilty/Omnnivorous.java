/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop.abilty;

/**
 *
 * @author Administrator
 */
public interface Omnnivorous extends Eatable {

    default String getType() {
        return Eatable.TYPE_OMNIVOROUS;
    }
}
