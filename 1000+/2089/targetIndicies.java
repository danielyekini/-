import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        // Initialise list to store target indicies
        List<Integer> list = new ArrayList<Integer>();
        
        // Sort nums array
        Arrays.sort(nums);

        // Linear search through array
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                list.add(i);
            }
        }

        // Return list
        return list;
    }
}