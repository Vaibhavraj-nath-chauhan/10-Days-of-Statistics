import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        double X2 = x + Math.pow(x,2);
        double Y2 = y + Math.pow(y,2);
        double Ca = 160 + 40*X2;
        double Cb = 128 + 40*Y2;
        System.out.printf("%.3f",Ca);
        System.out.printf("\n%.3f",Cb);
    }
}