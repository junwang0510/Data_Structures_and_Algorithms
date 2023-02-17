package Sorting;

public class QuickSort {
    // Best-case runtime: O(nlogn)
    // Average-case runtime: O(nlogn)
    // Worst-case runtime: O(n^2)
    // In-place: Yes
    // Stable: No

    public static void sort(int[] arr) {
        int n = arr.length;
        if (n < 2) return;
        quickSort(arr, 0, n - 1);
    }

    private static void quickSort(int[] arr, int lo, int hi) {
        if (lo < hi) {
            int pivot = hoarePartition(arr, lo, hi);
            quickSort(arr, lo, pivot);
            quickSort(arr, pivot + 1, hi);
        }
    }

    private static int hoarePartition(int[] arr, int lo, int hi) {
        int pivot = arr[lo + (hi - lo) / 2];
        int i = lo - 1;
        int j = hi + 1;
        while (true) {
            do {
                i++;
            } while (arr[i] < pivot);
            do {
                j--;
            } while (arr[j] > pivot);
            if (i >= j) {
                return j;
            }
            swap(arr, i, j);
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
