package LeetCode.NeetCode150.ArraysAndHashing;

import java.util.Map;
import java.util.HashMap;

class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        // Runtime: O(n)
        // Space: O(n)

        // num -> index
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int curr = nums[i];
            int complement = target - curr;
            if (map.containsKey(complement)) {
                return new int[]{i, map.get(complement)};
            }
            map.put(curr, i);
        }

        return null;
    }
}
