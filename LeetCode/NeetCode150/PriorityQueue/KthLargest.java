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

    // HeapSort (everything below)
    private void sort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }

        int N = arr.length;
        for (int i = N / 2 - 1; i >= 0; i--) {
            heapify(arr, N, i);
        }

        for (int i = N - 1; i >= 0; i--) {
            swap(arr, i, 0);
            heapify(arr, i, 0);
        }
    }

    private void heapify(int[] arr, int end, int root) {
        int curr = root;
        int left = root * 2 + 1;
        int right = left + 1;

        if (left < end && arr[left] < arr[curr]) {
            curr = left;
        }
        if (right < end && arr[right] < arr[curr]) {
            curr = right;
        }
        if (curr != root) {
            swap(arr, curr, root);
            heapify(arr, end, curr);
        }
    }

    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
