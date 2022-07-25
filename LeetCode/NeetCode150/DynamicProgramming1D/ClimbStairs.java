package LeetCode.NeetCode150.DynamicProgramming1D;

public class ClimbStairs {
    public int climbStairs(int n) {
        // Base case
        if (n <= 3) {
            return n;
        }

        // Array for memoization
        int[] arr = new int[n + 1];
        for (int i = 1; i <= 3; i++) {
            arr[i] = i;
        }
        return climb(n, arr);
    }

    private int climb(int n, int[] arr) {
        if (arr[n] != 0) {
            return arr[n];
        }
        int result = climb(n-1, arr) + climb(n-2, arr);
        // memoize
        arr[n] = result;
        return result;
    }
}
