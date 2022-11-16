package LeetCode.Others;

import java.util.*;

public class DotProduct {
    // Runtime: O(n)
    // Space: O(n)    unlikely to be n because we are processing sparse vectors

    // Note:
    // This approach is less optimal than the intuitive approach with two arrays.
    // However, it presents a way of thinking matching the idea of sparse vectors.

    private Map<Integer, Integer> map;

    DotProduct(int[] nums) {
        map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int n = nums[i];
            if (n != 0) {
                // store indices with non-zero values
                map.put(i, n);
            }
        }
    }

    public int dotProduct(DotProduct vec) {
        int res = 0;
        for (int n : vec.map.keySet()) {
            // only if both collections have nonzero values at index n
            if (this.map.containsKey(n)) {
                res += this.map.get(n) * vec.map.get(n);
            }
        }
        return res;
    }
}
