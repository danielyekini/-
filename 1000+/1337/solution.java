class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        // Initialise map of <strengths, rows>
        HashMap<Integer, List<Integer>> strengthMap = new HashMap<>();

        // Initialise integer array to store k weakest elements
        int[] kWeakest = new int[k];

        // Iterate through the rows
        for (int m = 0; m < mat.length; m++) {
            int[] row = mat[m];
            int rowStrength = 0;
            // Iterate over the values to find the number of 1's
            for (int n = 0; n < row.length && row[n] == 1; n++) {
                rowStrength++;
            }
            // Map soldier count to index
            strengthMap.putIfAbsent(rowStrength, new ArrayList<Integer>());
            strengthMap.get(rowStrength).add(m);
        }
        System.out.println(strengthMap);
        // Find k weakest rows
        int kCount = 0;
        for (int strength : new TreeSet<>(strengthMap.keySet())) {
            List<Integer> indicies = strengthMap.get(strength);
            for (int i = 0; i < indicies.size(); i++) {
                if (kCount == k) {
                    break;
                }
                kWeakest[kCount++] = indicies.get(i);
            }
        }

        return kWeakest;
    }
}