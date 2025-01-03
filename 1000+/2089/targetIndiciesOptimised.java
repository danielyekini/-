import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        // Initialize list
        List<Integer> list = new ArrayList<Integer>();

        // Initialize countLess and countTarget 
        int countLess = 0, 
            countTarget = 0;
        
        // Iterate through array
        for (int num : nums) {
            countLess = (num < target) ? countLess+1 : countLess; // Count number of values less than target
            countTarget = (num == target) ? countTarget+1 : countTarget; // Count number of values equal to target
        }
        
        while (countTarget > 0) {
            list.add(countLess++);
            countTarget--;
        }

        return list;
    }
}
