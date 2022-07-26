package Sorting;

public class BucketSort {

    /*
    Runtime: N + B (N = # of elements; B = # of buckets)
    In-place: no
    Stable: yes
     */

    /*
    find the minimum and maximum number in the array
    construct the array with minimal size
    traverse and fill the array with count
    traverse the array and override the original array
     */

    public static void sort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        // Find min and max
        for (int val : arr) {
            if (val < min) min = val;
            if (val > max) max = val;
        }

        // Initialize the buckets (value : count) with values in arr
        int[] buckets = new int[max - min + 1];
        for (int j : arr) {
            buckets[j - min]++;
        }

        int index = 0;
        int i = 0;
        while (i < buckets.length) {
            if (buckets[i] != 0) {
                arr[index] = i + min;
                buckets[i]--;
                index++;
            } else {
                i++;
            }
        }
    }
}
