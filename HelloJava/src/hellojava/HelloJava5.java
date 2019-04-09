/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hellojava;

/**
 *
 * @author Administrator
 */
public class HelloJava5 {
    public static boolean isPrime(int n){
        if (n<=1) {
            return false;
        }else{
            boolean is =false;
            for (int i = 2; i <=Math.sqrt(n); i++) {
                if (n%i!=0) {
                    is=true;
                    break;
                }
            }
            return is;
        }
    }
    public static void main(String[] args) {
        int n=16;
        boolean is=isPrime(n);
        System.out.printf("%d %s a prime.\n",n,is?"is":"is not");
    }
}
