package Sorting;

public class InsertionSort {

    /*
    Worst-case runtime: n^2
    In-practice runtime: n^2
    Best-case runtime: n
    In-place: yes
    Stable: yes
     */

    public static void sort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }

        int N = arr.length;
        for (int end = 1; end < N; end++) {
            int curr = end;
            while (curr - 1 >= 0 && arr[curr - 1] > arr[curr]) {
                swap(curr, curr - 1, arr);
                curr--;
            }
        }
    }

    public static void swap(int i, int j, int[] arr) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
