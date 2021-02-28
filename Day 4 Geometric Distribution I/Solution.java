import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n=0;
        double p=0,q=0;
        double [] a = new double[3];
        for(int i=0;i<3;i++){
            a[i] = sc.nextInt();
        }
        n = a[2];
        p = a[0]/a[1];
        q = 1-p;
        p = (Math.pow(q,n-1))*p;
        System.out.printf("%.3f",p);
    }
}