import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        // Initialize set to store seen numbers
        Set<Integer> seen = new HashSet<>();

        // Initialize int array to store numbers that appear in both nums1 & nums2
        int[] res = new int[(nums1.length > nums2.length) ? nums1.length : nums2.length];

        // Iterate over nums1, store each value in set
        for (int num : nums1) {
            seen.add(num);
        }

        // Iterate over nums2, check each value against the seen values from nums1
        int i = 0;
        for (int num : nums2) {
            if (seen.contains(num)) {
                res[i++] = num;
                seen.remove(num);
            }
        }

        return Arrays.copyOfRange(res, 0, i);
    }
}
