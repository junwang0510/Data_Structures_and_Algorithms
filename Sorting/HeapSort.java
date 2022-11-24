package Sorting;

public class HeapSort {

    /*
    Runtime: O(nlogn)
    In-place: yes
    Stable: no (buildHeap ruins the order)
     */

    public static void sort(int[] arr) {
        int n = arr.length;
        if (n < 2) return;

        // Floyd's Build Heap Algorithm (max heap)
        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(arr, i, n);

        // move larger values to the end
        for (int i = n - 1; i > 0; i--) {
            swap(arr, 0, i);
            heapify(arr, 0, i);
        }
    }

    private static void heapify(int[] arr, int i, int n) {
        // pick the largest of three
        int largest = i;
        int l = 2 * i + 1;
        int r = l + 1;

        if (l < n && arr[l] > arr[largest])
            largest = l;
        if (r < n && arr[r] > arr[largest])
            largest = r;

        // continue to check if percolation is needed if percolated
        if (largest != i) {
            swap(arr, i, largest);
            heapify(arr, largest, n);
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
