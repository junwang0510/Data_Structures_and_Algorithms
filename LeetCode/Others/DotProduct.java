package LeetCode.Others;

import java.util.*;

public class DotProduct {
    private int len;
    private int[] vect;

    DotProduct(int[] nums) {
        this.len = nums.length;
        this.vect = Arrays.copyOf(nums, len);
    }

    public int dotProduct(DotProduct vec) {
        int res = 0;
        for (int i = 0; i < this.len; i++) {
            res += this.vect[i] * vec.vect[i];
        }
        return res;
    }
}
