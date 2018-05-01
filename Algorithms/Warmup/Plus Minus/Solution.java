import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.text.DecimalFormat;

public class Solution {

    static void plusMinus(int[] arr, int n) {
        // Complete this function
        DecimalFormat deciamlFormat = new DecimalFormat(".######");
        double positive = 0; 
        double negative = 0;
        double zero = 0;
        for(int i = 0; i < n; i++){
            if(arr[i] > 0)
                positive++;
            else if(arr[i] < 0)
                negative++;
            else
                zero++;
        }
        System.out.println(deciamlFormat.format(positive/n));
        System.out.println(deciamlFormat.format(negative/n));
        System.out.println(deciamlFormat.format(zero/n));
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        plusMinus(arr, n);
        in.close();
    }
}
