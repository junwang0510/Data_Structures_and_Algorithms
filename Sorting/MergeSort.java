package Sorting;

import java.util.Arrays;

public class MergeSort {

    /*
    Runtime: nlogn
    In-place: no
    Stable: yes
     */

    public static void sort(int[] arr) {
        int n = arr.length;
        if (n < 2) return;

        // Divide into two halves
        int[] left = Arrays.copyOfRange(arr, 0, n / 2);
        int[] right = Arrays.copyOfRange(arr, n / 2, n);

        // Recursively sort two halves (Bottom-up recursion)
        sort(left);
        sort(right);

        int[] merged = new int[left.length + right.length];
        int l = 0, r = 0, i = 0;
        while (true) {
            if (l < left.length && r < right.length) {
                merged[i++] = left[l] <= right[r] ? left[l++] : right[r++];
            } else if (l < left.length) {
                merged[i++] = left[l++];
            } else if (r < right.length) {
                merged[i++] = right[r++];
            } else {
                break;
            }
        }

        System.arraycopy(merged, 0, arr, 0, arr.length);
    }
}
