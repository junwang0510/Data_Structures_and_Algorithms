package LeetCode.NeetCode150.BitManipulation;

public class MissingNumber {
    // Bit Version
    // Runtime: O(n)
    // Space: O(1)

    public int missingNumber(int[] nums) {
        int result = 0;
        int n = nums.length;
        for (int i = 1; i <= n; i++) result ^= i;
        for (int num : nums) result ^= num;
        return result;
    }

    // Arithmetic Version
    // Runtime: O(n)
    // Space: O(1)
    public int missingNumber2(int[] nums) {
        int n = nums.length;
        int total = n * (n + 1) / 2;
        for (int num : nums) total -= num;
        return total;
    }
}
