import java.util.Arrays;

class Solution {
    public int[][] minAbsDiff(int[][] grid, int k) {
        int n = grid.length;
        int m = grid[0].length;
        
        int[][] result = new int[n - k + 1][m - k + 1];

        // If k == 1, all answers are 0
        if (k == 1) return result;

        for (int i = 0; i <= n - k; i++) {
            for (int j = 0; j <= m - k; j++) {

                int[] arr = new int[k * k];
                int idx = 0;

                // Extract k x k submatrix
                for (int r = i; r < i + k; r++) {
                    for (int c = j; c < j + k; c++) {
                        arr[idx++] = grid[r][c];
                    }
                }

                // Sort the elements
                Arrays.sort(arr);

                int min = Integer.MAX_VALUE;

                // Find minimum absolute difference between distinct elements
                for (int x = 1; x < arr.length; x++) {
                    if (arr[x] != arr[x - 1]) {
                        min = Math.min(min, arr[x] - arr[x - 1]);
                    }
                }

                // If all elements are same
                if (min == Integer.MAX_VALUE) {
                    min = 0;
                }

                result[i][j] = min;
            }
        }

        return result;
    }
}