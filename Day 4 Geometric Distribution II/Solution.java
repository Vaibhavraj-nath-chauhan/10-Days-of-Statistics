import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        double p=0,q=0,sum=0;
        double [] a =new double[3];
        for(int i=0;i<3;i++){
            a[i] = sc.nextDouble();
        }
        p = a[0]/a[1];
        q = 1-p;
        for(int i=1;i<a[2]+1;i++){
            sum += Math.pow(q,i-1)*p;
        }
        System.out.printf("%.3f",sum);
    }
}