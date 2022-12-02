package LeetCode.NeetCode150.BitManipulation;

public class CountingBits {
    // Runtime: O(n)
    // Space: O(1)  output array does not count towards space complexity

    public int[] countBits(int n) {
        int[] res = new int[n + 1];
        for (int i = 1; i <= n; i++) res[i] = 1 + res[i & (i - 1)];
        return res;
    }
}
