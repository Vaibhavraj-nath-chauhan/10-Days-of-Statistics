import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 5;
        double stu =80,xi =0,yi=0,xy = 0,x2 =0,x_m =0,y_m=0;
        double def_x,def_y,a,b,y_b;
        for(int i=0;i<n;i++){
            def_x = sc.nextInt();
            def_y = sc.nextInt();
            xi += def_x;
            yi += def_y;
            xy += def_x*def_y;
            x2 += def_x*def_x;
        }
        x_m = xi/n;
        y_m = yi/n;
        b = ((n*xy)-(xi*yi))/((n*x2)-Math.pow(xi, 2));
        a = y_m - x_m*b;
        y_b = a + b*stu;
        System.out.printf("%.3f",y_b);
    }
}