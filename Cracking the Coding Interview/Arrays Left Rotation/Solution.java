import java.util.Scanner;

public class Solution {

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        String[] nd = scan.nextLine().split(" ");

        int n = Integer.parseInt(nd[0].trim());

        int d = Integer.parseInt(nd[1].trim());

        int[] inArr = new int[n];

        String[] aItems = scan.nextLine().split(" ");

        for (int aItr = 0; aItr < n; aItr++) {
            int aItem = Integer.parseInt(aItems[aItr].trim());
            inArr[aItr] = aItem;
        }
        
        if((n - d) < (n / 2)) {
        	for(int i = 0; i < (n-d); i++) {
        		inArr = moveLastElementToRight(inArr, n);
        	}
        } else {
	        for(int i=0; i < d; i++) {
	        	inArr = moveLastElementToLeft(inArr, n);
	        }
        }
        for(int i = 0; i < n; i++) {
        	System.out.print(inArr[i] + " ");
        }

        
    }

	private static int[] moveLastElementToRight(int[] inArr, int n) {
		int tempArray[] = new int[n];
		tempArray[0] = inArr[n-1];
		
		for(int i = 1; i < n; i++) {
			tempArray[i] = inArr[i -1];
		}
		return tempArray;
	}

	private static int[] moveLastElementToLeft(int[] inArr, int n) {
		int tempArray[] = new int[n];
		int firstElement = inArr[0];
		for (int i = 1; i < n; i++) {
			tempArray[i-1] = inArr[i];
		}
		tempArray[n - 1] = firstElement;
		return tempArray;
	}
}
