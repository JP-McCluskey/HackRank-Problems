//

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    static void plusMinus(int[] arr) {
        // Complete this function
        float positive = 0;
        float negative = 0;
        float zero = 0;
        int n = arr.length;
        for(int arr_i = 0; arr_i < n; arr_i++){
            if (arr[arr_i]>0){
                positive = positive + 1;
            }
            else if(arr[arr_i]<0){
                negative = negative + 1;
            }
            else{
                zero = zero + 1;
            }
        }
        
        System.out.println(positive/n);
        System.out.println(negative/n);
        System.out.println(zero/n);
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        plusMinus(arr);
        in.close();
    }
}
