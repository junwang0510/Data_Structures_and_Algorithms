package LeetCode.NeetCode150.BitManipulation;

public class SingleNumber {
    // Runtime: O(n)
    // Space: O(1)

    public int singleNumber(int[] nums) {
        int result = 0;
        for (int n : nums) result ^= n;
        return result;
    }
}
