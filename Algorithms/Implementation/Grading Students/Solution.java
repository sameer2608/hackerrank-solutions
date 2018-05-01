import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int[] solve(int[] grades){
        // Complete this function
        int[] finalGrades = new int[grades.length];
        int i=0;
        for(int grade : grades){
            finalGrades[i] = grade;
            if(grade > 37) {
                int nextMultipleOfFive = getNextMultipleOfFive(grade);
                if((nextMultipleOfFive - grade) < 3)
                    finalGrades[i] = nextMultipleOfFive;
            }
            i++;
        }
       return finalGrades; 
    }
    
    
    
   static int getNextMultipleOfFive(int x){
        return ((x / 5) + 1)*5;
    }
    
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] grades = new int[n];
        for(int grades_i=0; grades_i < n; grades_i++){
            grades[grades_i] = in.nextInt();
        }
        int[] result = solve(grades);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? "\n" : ""));
        }
        System.out.println("");
        

    }
}
