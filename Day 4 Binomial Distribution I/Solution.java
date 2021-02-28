import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double boy = sc.nextDouble();
        double girl = sc.nextDouble();
        double p = boy/(boy+girl);
        double q = 1-p;
        double n=6;
        double fact =0,bil=0;
        double data =0;
        for(int i=3;i<=6;i++){
            fact = f(n)/(f(i)*f(n-i));
            bil = Math.pow(p,i)*Math.pow(q, n-i);
            data += fact*bil;
        }
        System.out.printf("%.3f",data);
    }
    public static double f(double n){
        double fact =1;
        for(int i=1;i<=n;i++){
            fact *=i;
        }
        return fact;
    }
}