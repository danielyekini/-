class Solution {
    public String longestCommonPrefix(String[] strs) {
        String s = strs[0];

        if (s.equals("") || strs.length <= 1) return s;
        
        for (int i = 1; i < strs.length; i++) {

            int j = 1;
            String s1 = strs[i];
            int ceil = (s.length() < s1.length()) ? s.length() : s1.length();
            String longestPrefix = "";

            while (j <= ceil && s.substring(0, j).equals(s1.substring(0, j))) {
                System.out.println(s.substring(0, j) + " " + s1.substring(0, j));
                longestPrefix = s.substring(0, j);
                j++;
            }

            if (s1.indexOf(longestPrefix) == -1 ) return "";
            s = longestPrefix;
        }
        return s;
    }
}