import java.io.*;
import java.util.*;
public class Solution{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt();
        int [] array = new int[value];
        for(int i =0;i<value;i++){
            array[i] = sc.nextInt();
        }
        Arrays.sort(array);
        System.out.println(mean(array,value));
        System.out.println(median(array,value));
        System.out.println(mode(array,value));
    }

    public static double mean(int[] array,int value){
        double mean =0;
        for(int i =0;i<array.length;i++){
            mean += array[i];
        }
        mean = mean/value;
        return mean;
    }
    public  static double median(int[] array, int value){
        double median =0;
        int number = 0;
        if(value%2==0){
            number = (value/2)-1;
            median = (double)(array[number]+array[number+1])/2;
        }else{
            number = (value+1)/2;
            median = array[number]/2;
        }
        return median;
        
    }
    public static int mode(int[] array,int value){
        int mode = 0;
        int number=array[0];
        int count = 0;
        int max = 0;
        for(int i=0;i<value;i++){
            if(array[i]==number){
                count++;
            }else{
                count =1;
                number = array[i];
            }
            if(count>max){
                max = count;
                mode = array[i];
            }
        }
        return mode;
    }
}
