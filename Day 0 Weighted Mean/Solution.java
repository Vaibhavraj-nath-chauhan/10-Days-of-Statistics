import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt();
        int [] a = new int[value];
        int [] b = new int[value];
        for(int i=0;i<value;i++){
            a[i] = sc.nextInt();
        }
        for(int i=0;i<value;i++){
            b[i] = sc.nextInt();
        }
        System.out.format("%.1f",mean(a,b,value));
    }

    public static double mean(int[] a,int[] b,int value){
        float mean =0;
        int sum =0;
        for(int i=0;i<value;i++){
            mean += a[i]*b[i];
        }
        for(int i:b){
            sum +=i;
        }
        mean = mean/sum;
        return mean;

    }
}