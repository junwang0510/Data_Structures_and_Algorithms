package LeetCode.NeetCode150.PriorityQueue;

import java.util.PriorityQueue;
import java.util.Arrays;

public class KthLargest {
    // Runtime: O(nlogk)
    // Space: O(k)

    private int ct;
    private PriorityQueue<Integer> pq;

    public KthLargest(int k, int[] nums) {
        ct = k;
        pq = new PriorityQueue<>();
        Arrays.sort(nums);
        int l = 0;
        int r = nums.length - 1;
        while (l < r) {
            int temp = nums[l];
            nums[l] = nums[r];
            nums[r] = temp;
            l++;
            r--;
        }
        for (int i = 0; i < Math.min(ct, nums.length); i++) {
            pq.add(nums[i]);
        }
    }

    public int add(int val) {
        pq.add(val);
        if (pq.size() > ct) {
            pq.remove();
        }
        return pq.peek();
    }
}
