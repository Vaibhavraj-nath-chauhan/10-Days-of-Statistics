import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double rej = sc.nextDouble();
        int n = sc.nextInt();
        double p = rej/100;
        double q = 1-p;
        double fact =0;
        double bil=0;
        double data=0;
        for(int i=0;i<=2;i++){
            fact = f(n)/(f(i)*f(n-i));
            bil = Math.pow(p,i)*Math.pow(q, n-i);
            data += fact*bil;
        }
        System.out.printf("%.3f", data);
        data = 0;
        for(int i=0;i<2;i++){
            fact = f(n)/(f(i)*f(n-i));
            bil = Math.pow(p,i)*Math.pow(q, n-i);
            data += fact*bil;
        }
        data = 1-data;
        System.out.printf("\n%.3f", data);
    }
    public static double f(double n){
        double fact =1;
        for(int i=1;i<=n;i++){
            fact *=i;
        }
        return fact;
    }
}