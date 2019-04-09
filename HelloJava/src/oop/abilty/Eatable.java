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
public abstract interface Eatable {
    String TYPE_VEGETARIAN="食草";
    String TYPE_CARNIVOROUS="食肉";
    String TYPE_OMNIVOROUS="杂食";
    public static String[] getTypes(){
        return new String[]{TYPE_VEGETARIAN,TYPE_CARNIVOROUS,TYPE_OMNIVOROUS};
    }
    public abstract String[] getType();
    public abstract void eat();
}
