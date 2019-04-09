package hellojava;
import java.util.Scanner;
public class HelloJava1 {

    public static double usingFor(int n) {
        double sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += 1 / (double) i;
        }
        return sum;
    }

    public static double usingWhile(int n) {
        double sum = 0;
        int i = 1;
        while (i <= n) {
            sum += 1 / (double) i;
            i++;
        }
        return sum;
    }

    public static double usingDowhile(int n) {
        double sum = 0;
        int i = 1;
        do {
            sum += 1 / (double) i;
            i++;
        } while (i <= n);
        return sum;
    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        if (n >= 1) {
            System.out.printf("%.3f\n",HelloJava1.usingFor(n) );
            System.out.printf("%.3f\n",HelloJava1.usingWhile(n) );
            System.out.printf("%.3f\n",HelloJava1.usingDowhile(n) );
            
        } else {
            System.out.println("无解");
        }
    }

}
