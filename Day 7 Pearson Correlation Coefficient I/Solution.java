import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double x_m=0,y_m=0,a=0,b=0,main_xy=0,x_st=0,y_st=0,per;
        double [] x = new double[n];
        double [] y = new double[n];
        for(int i=0;i<n;i++){
            x[i] = sc.nextDouble();
            x_m += x[i];
            y_m += y[i];
        }
        for(int i=0;i<n;i++){
            y[i] = sc.nextDouble();
            y_m += y[i];
        }
        x_m = x_m/n;
        y_m = y_m/n;
        for(int i=0;i<n;i++){
            a = x[i] - x_m;
            b = y[i] - y_m;
            main_xy += a*b;
            x_st += Math.pow(a, 2);
            y_st += Math.pow(b, 2);
        }
        x_st = x_st/n;
        y_st = y_st/n;
        x_st = Math.pow(x_st,.5);
        y_st = Math.pow(y_st,.5);
        per = main_xy/(n*x_st*y_st);
        System.out.printf("%.3f",per);
    }
}