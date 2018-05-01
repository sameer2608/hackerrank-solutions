import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Solution {
    Map<String, Integer> magazineMap;
    Map<String, Integer> noteMap;
    
    public Solution(String magazine, String note) {
    	magazineMap = new HashMap<>();
    	noteMap = new HashMap<>();
    	populateMap(magazineMap, magazine.split(" "));
    	populateMap(noteMap, note.split(" "));
    }
    
    private void populateMap(Map<String, Integer> wordsMap, String[] split) {
    	
    	for(int i = 0; i < split.length; i++) {
    		if(wordsMap.containsKey(split[i])) {
    			int occurance = wordsMap.get(split[i]) + 1;
    			wordsMap.put(split[i], occurance);
    		} else {
    			wordsMap.put(split[i], 1);
    		}
    	}
	}

	public boolean solve() {
		
       	for(Map.Entry<String, Integer> entry : noteMap.entrySet()) {
			if(magazineMap.containsKey(entry.getKey()) 
					&& magazineMap.get(entry.getKey()) >= entry.getValue()) {
				continue;
			} else {
				return false;
			}
		}
    	return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        
        // Eat whitespace to beginning of next line
        scanner.nextLine();
        
        Solution s = new Solution(scanner.nextLine(), scanner.nextLine());
        scanner.close();
        
        boolean answer = s.solve();
        if(answer)
            System.out.println("Yes");
        else System.out.println("No");
      
    }
}

