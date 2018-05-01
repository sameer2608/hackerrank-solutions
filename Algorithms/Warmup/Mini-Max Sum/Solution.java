import java.util.Scanner;

public class Solution {

    static void miniMaxSum(int[] arr) {
        // Complete this function
        long minSum = Long.MAX_VALUE; long maxSum = Long.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
        	long sum = 0;
            for(int j = 0; j < arr.length; j++){
                if(i != j)
                    sum += arr[j];
            }
            minSum = Math.min(minSum, sum);
            maxSum = Math.max(maxSum, sum);
        }
        
        System.out.print(minSum + " " + maxSum);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        for(int arr_i = 0; arr_i < 5; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        in.close();
        miniMaxSum(arr);
    }
}
