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
        // recursively split into two halves based on the chosen pivot
        if (lo < hi) {
            int pivot = partition(arr, lo, hi);
            quickSort(arr, lo, pivot - 1);
            quickSort(arr, pivot + 1, hi);
        }
    }

    private static int partition(int[] arr, int lo, int hi) {
        int pivot = arr[hi];
        int i = lo - 1;
        for (int j = lo; j < hi; j++) {
            if (arr[j] <= pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, hi);
        return i + 1;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
