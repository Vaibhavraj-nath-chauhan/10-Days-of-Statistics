import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int n = sc.nextInt();
        double a,b,d=0,output;
        double [] x = new double[n];
        double [] y = new double[n];
        for(int i =0;i<n;i++){
            x[i] = sc.nextDouble();
        }
        for(int i =0;i<n;i++){
            y[i] = sc.nextDouble();
        }
        double [] x_copy = Arrays.copyOf(x, n);
        double [] y_copy = Arrays.copyOf(y, n);
        Arrays.sort(x_copy);
        Arrays.sort(y_copy);
        for(int i =0;i<n;i++){
            a = Arrays.binarySearch(x_copy, x[i])+1;
            b = Arrays.binarySearch(y_copy, y[i])+1;
            d += Math.pow(a-b,2);
        }
        output = 1-((6*d)/(n*(Math.pow(n,2)-1)));
        System.out.printf("%.3f",output);
    }
}