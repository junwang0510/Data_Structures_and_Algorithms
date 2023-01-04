package LeetCode.NeetCode150.BitManipulation;

public class HammingWeight {
    public int hammingWeight(int n) {
        // Time: O(1)
        // Space: O(1)

        int ct = 0;
        int mask = 1;
        for (int i = 0; i < 32; i++) {
            if ((n & mask) != 0)
                ct++;
            mask <<= 1;
        }
        return ct;
    }
}
