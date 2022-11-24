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
        int n = arr.length;
        if (n < 2) return;
        for (int i = 1; i <= n - 1; i++) {
            int j = i;
            while (j - 1 >= 0 && arr[j] < arr[j - 1]) {
                swap(arr, j, j - 1);
                j--;
            }
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
