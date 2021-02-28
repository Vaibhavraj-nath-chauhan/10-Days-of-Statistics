import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        double [] a = new double[2];
        double e = 2.71828,data =0,fact=1;
        for(int i=0;i<a.length;i++){
            a[i] = sc.nextDouble();
        }
        for(int i=1;i<=a[1];i++){
            fact *= i;
        }
        data = ((Math.pow(a[0],a[1]))*(Math.pow(e,-a[0])))/fact;
        System.out.printf("%.3f",data);
    }
}