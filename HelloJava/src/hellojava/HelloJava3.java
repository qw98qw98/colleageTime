/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hellojava;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Vector;

/**
 *
 * @author Administrator
 */
public class HelloJava3 {
        public static double average(int[][] data){
        double sum = 0;
        int count=0;
        for(int x[] : data)
        {
            System.out.println(Arrays.toString(x));
            count+=x.length;
            for (int y :x){
                sum+=y;
            }
        }
        return sum/(double)count;
    }
    public static int[][] generateData(int n){
            int[][] qunence=new int[n][];
            for (int i=0;i<n;i++){
                qunence[i]=new int[i+1];   
                int temp=i+1;
                for (int j = 0; j < i+1; j++) {
                    qunence[i][j]=temp--;
                }
            }
            return qunence;
    }
    public static void showData(int[][] data){
            for(int[] x:data)
                System.out.println(Arrays.toString(x));
        }
    public static void main(String[] args) {
        System.out.println(average(new int[][]{{4,9,9,4,6,4},{1,2,3},{4,5,6}}));
        int[][] x=generateData(9);
        showData(x);
    }
    }
