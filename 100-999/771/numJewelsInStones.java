class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int count = 0;
        
        for (int i = 0; i < stones.length(); i++) {
            char c = stones.charAt(i);
            count = (jewels.indexOf(c) != -1) ? count + 1 : count;
        }

        return count;
    }
}