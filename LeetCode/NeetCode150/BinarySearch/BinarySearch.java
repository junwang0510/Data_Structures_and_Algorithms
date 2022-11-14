package LeetCode.NeetCode150.BinarySearch;

class BinarySearch {
    public int search(int[] nums, int target) {
        // Runtime: O(log n)
        // Space: O(1)

        int lo = 0, hi = nums.length - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            int midVal = nums[mid];
            if (midVal == target) {
                return mid;
            } else if (midVal < target) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return -1;
    }
}