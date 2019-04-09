/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hellojava;

import java.util.Arrays;

/**
 *
 * @author 胡浩然
 */
public class HelloJava4 {
    public static int[] generateData(int n,int max){
        int[] data=new int[n];
        for (int i = 0; i < n; i++) {
            double temp=Math.random();
            int sign=temp<0.5?-1:1;
            data[i]=(int)(sign*temp*max);
            assert data[i]!=0:"temp="+temp;
        }
        return data;
    }
    public static void main(String[] args) {
        int[] data=generateData(10,50);
        System.out.println(Arrays.toString(data));
    }
}
