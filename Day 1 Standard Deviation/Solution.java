import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int sum =0;
        double mean=0,data =0;
        int [] list = new int[N];
        for(int i =0;i<N;i++){
            list[i] = sc.nextInt();
            sum += list[i];
        }
        mean = sum/N;
        for(int i =0;i<N;i++){
            data += Math.pow(list[i]-mean,2);
        }
        mean = Math.pow((data/N),.5);
        System.out.printf("%.1f",mean);
        
    }
}