package LeetCode.NeetCode150.BitManipulation;

public class HammingWeight {
    public int hammingWeight(int n) {
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
