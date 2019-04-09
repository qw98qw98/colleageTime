/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hellojava;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class HelloJava2 {
    public static double average(int[] data){
        double sum = 0;
        for (int x:data) { 
            sum+=x;
        }
        return sum/(double)data.length;
    }
    public static int[] generateData(int n,int max){
        Random rand=new Random();
        int[] numArray=new int[n];
        for (int i = 0; i < n; i++) {     
           numArray[i]=Math.random()>=0.5?(int)(Math.random()*max)*(-1):(int)(Math.random()*max);
            if (numArray[i]==0){
                System.out.println("000");
            }
        }
        return numArray;
    }
    @SuppressWarnings("empty-statement")
    public static void moveData(int[] data){
        int i=-1,j=data.length;
        while(i!=j){
            while(i!=j&&data[++i]<0);
            while(i!=j&&data[--j]>=0);
            int temp=data[i];
            data[i]=data[j];
            data[j]=temp;       
        }
    }
    public static void main(String[] args) {
        //**************数据输入*******************
        Scanner scan=new Scanner(System.in);
        System.out.print("n = ");
        int x=scan.nextInt();
        System.out.print("max = ");
        int y=scan.nextInt();
        int[] quence=generateData(x,y);
        //**************************************
        System.out.println(Arrays.toString(quence));
        System.out.println(average(quence));
        moveData(quence);
        System.out.println(Arrays.toString(quence));
    }
    
    
}
