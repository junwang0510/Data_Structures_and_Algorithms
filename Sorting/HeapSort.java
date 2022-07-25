package Sorting;

public class HeapSort {

    /*
    Worst-case runtime: nlogn
    In-practice runtime: nlogn
    Best-case runtime: nlogn
    In-place: yes
    Stable: no (buildHeap ruins the order)
     */

    public static void sort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        int n = arr.length;

        // Build Heap
        for (int i = n/2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }

        // Extract max elements from the heap
        for (int i = n - 1; i > 0; i--) {
            swap(arr, 0, i);
            heapify(arr, i, 0);
        }
    }

    public static void heapify(int[] arr, int end, int root) {
        int curr = root;
        int left = 2 * curr + 1;
        int right = left + 1;

        if (left < end && arr[left] > arr[curr]) {
            curr = left;
        }
        if (right < end && arr[right] > arr[curr]) {
            curr = right;
        }
        if (curr != root) {
            swap(arr, root, curr);
            heapify(arr, end, curr);
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
