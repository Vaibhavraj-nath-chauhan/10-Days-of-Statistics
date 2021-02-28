import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int [] array = new int[size];
        for(int i=0;i<size;i++){
            array[i] = sc.nextInt();
        }
        Arrays.sort(array);
        int index_0 =0, index_1 =0;
        int value = array.length;
        if(value%2==0){
            index_0 = (value/2)-1;
            index_1 = index_0 +1;
            int [] a = Arrays.copyOfRange(array, 0, index_0+1);
            int [] b = Arrays.copyOfRange(array,index_0,index_1+1);
            int [] c = Arrays.copyOfRange(array,index_1,array.length);
            even(a,c,b);
            

        }else{
            index_0 = (value+1)/2-1;

            int [] a = Arrays.copyOfRange(array, 0, index_0);
            int b = array[index_0];
            int [] c = Arrays.copyOfRange(array, index_0+1, array.length);
            odd(a,c,b);
        }
    }
    public static void odd(int[] a,int[] c,int b){
        int index_0 = 0,index_1=0;
        int size = 0;
        size = a.length;
        index_0 = (size/2)-1;
        index_1 = index_0 +1;
        size = (a[index_0] + a[index_1])/2;
        System.out.println(size);
        ///////////////////////////////////////////
        System.out.println(b);
        //////////////////////////////////////////
        size = c.length;
        index_0 = (size/2)-1;
        index_1 = index_0 +1;
        size = (c[index_0] + c[index_1])/2;
        System.out.println(size);

    }
    public static void even(int[] a,int[] c,int[] b){
        int index_0 = 0,index_1=0;
        int size = 0;
        size = a.length;
        if (size%2==0){
            index_0 = (size/2)-1;
            index_1 = index_0 +1;
            size = (a[index_0] + a[index_1])/2;
            System.out.println(size);
        }
        else{
            index_0 = (size+1)/2-1;
            size = (a[index_0]);
            System.out.println(size);
        }
        ////////////////////////////////////////////////
        size = b.length;
        if (size%2==0){
            index_0 = (size/2)-1;
            index_1 = index_0 +1;
            size = (b[index_0] + b[index_1])/2;
            System.out.println(size);
        }
        else{
            index_0 = (size+1)/2-1;
            size = (b[index_0]);
            System.out.println(size);
        }
        /////////////////////////////////////////////////
        size = c.length;
        if (size%2==0){
            index_0 = (size/2)-1;
            index_1 = index_0 +1;
            size = (c[index_0] + c[index_1])/2;
            System.out.println(size);
        }
        else{
            index_0 = (size+1)/2-1;
            size = (c[index_0]);
            System.out.println(size);
        }
    }
}