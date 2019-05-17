/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop.util;

import java.util.Random;

/**
 *
 * @author Administrator
 */
public final class Utility {

    public static int[] randomNumbers(int n, int max) {
        int[] num=new int[n];
        Random rd = new Random();
        for (int i = 0; i < num.length; i++) {
            num[i]=rd.nextInt(max);
        }
        return num;
    }

    public static double[] randomNumbers(int n, double  max) {
        double [] num=new double [n];
        Random rd = new Random();
        for (int i = 0; i < num.length; i++) {
            num[i]=rd.nextDouble()*max*10;
        }
        return num;
    }

    public static int[] randomNumbers(int n,int min, int max) {
        int[] num=new int[n];
        Random rd = new Random();
        for (int i = 0; i < num.length; i++) {
            num[i]=rd.nextInt(max-min)+min;
        }
        return num;
    }

    public static double[] randomNumbers(int n, double min,double  max) {
        double [] num=new double [n];
        Random rd = new Random();
        for (int i = 0; i < num.length; i++) {
            num[i]=(rd.nextDouble()*(max-min)*10)+min;
        }
        return num;
    }
}
