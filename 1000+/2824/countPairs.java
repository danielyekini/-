import java.util.List;

public class countPairs {

    class Solution {
        public int countPairs(List<Integer> nums, int target) {
            // Initalise pair count
            int pairCount = 0;
    
            // Loop over and check every pair in list
            for(int i = 0; i < nums.size()-1; i++) {
                for(int j = i+1; j < nums.size(); j++) {
                    if (nums.get(i) + nums.get(j) < target) {
                        pairCount++;
                    }
                }
            }
    
            // Return the result
            return pairCount;
        }
    }
}
