package Sorting;

public class SelectionSort {

    /*
    Runtime: n^2
    In-place: yes
    Stable: no
     */

    public static void sort(int[] arr) {
        int n = arr.length;
        if (n < 2) return;
        for (int i = 0; i <= n - 2; i++) {
            int min = i;
            for (int j = i + 1; j <= n - 1; j++) {
                if (arr[min] > arr[j]) min = j;
            }
            swap(arr, i, min);
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
