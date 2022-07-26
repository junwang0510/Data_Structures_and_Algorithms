package Sorting;

public class HeapSort {

    /*
    Runtime: O(nlogn)
    In-place: yes
    Stable: no (buildHeap ruins the order)
     */

    public static void sort(int[] arr) {
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

    public static void heapify(int[] arr, int end, int root) {
        int curr = root;
        int left = root * 2 + 1;
        int right = left + 1;

        if (left < end && arr[left] > arr[curr]) {
            curr = left;
        }
        if (right < end && arr[right] > arr[curr]) {
            curr = right;
        }
        if (curr != root) {
            swap(arr, curr, root);
            heapify(arr, end, curr);
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
