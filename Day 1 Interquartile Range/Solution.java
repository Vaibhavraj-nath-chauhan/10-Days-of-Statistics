import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(),sum=0;
        int [] X= new int[N];
        int [] F= new int[N];
        for(int i=0;i<N;i++){
            X[i] = sc.nextInt();
        }
        for(int i=0;i<N;i++){
            F[i] = sc.nextInt();
            sum += F[i];
        }
        int [] outcome = new int[sum];
        sum = 0;
        for(int i=0;i<N;i++){
            int [] k = new int[F[i]];
            Arrays.fill(k,X[i]);
            for(int j=0;j<k.length;j++){
                outcome[sum] = k[j];
                sum+=1;
            }
        }
    
        Arrays.sort(outcome);
        if(sum%2==0){
            int index = (sum/2)-1;
            int [] a = Arrays.copyOfRange(outcome, 0, index+1);
            int [] b = Arrays.copyOfRange(outcome, index+1, sum);
            System.out.println(median(b)-median(a));
    
        }else{
            int index = (sum+1)/2;
            int [] a = Arrays.copyOfRange(outcome, 0, index-1);
            int [] b = Arrays.copyOfRange(outcome, index, sum);
            System.out.println(median(b)-median(a));
        }
    }
    public static double median(int[] test){
        int l = test.length;
        if(l%2==0){
            int a = (l/2)-1;
            int b = a+1;
            return ((test[a]+test[b])/2);
        }
        else{
            int a = (l-1)/2;
            return (test[a]);
        }
    }
}

