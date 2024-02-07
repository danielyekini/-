class Solution {
    public int removeDuplicates(int[] nums) {
        int l = 0, r = 0;
        
        while (r < nums.length) {
            int count = 1;
            while (r < nums.length-1 && nums[r] == nums[r+1]) {
                count += 1;
                r += 1;
            }

            for (int i = 0; i < Math.min(2, count); i++) {
                nums[l] = nums[r];
                l += 1;
            }
            r += 1;
        }

        return l;
    }
}