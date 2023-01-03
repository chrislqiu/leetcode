class Solution {
    public int uniquePaths(int m, int n) {
        //Creating cache array
        int[][] cache = new int[m][n];
        //Initially fills with 1
        for (int[] row : cache) {
            Arrays.fill(row, 1);
        }
        //Loops through and recalculates values for all boxes instead of the last column and row
        for (int i = m - 2; i >= 0; i--) {
            for (int j = n - 2; j >= 0; j--) {
                cache[i][j] = cache[i + 1][j] + cache[i][j + 1];
            }
        }
        //Returns [0][0] which is the starting position
        return cache[0][0];
    }
}
