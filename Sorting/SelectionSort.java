package Sorting;

public class SelectionSort {

    /*
    Worst-case runtime: n^2
    In-practice runtime: n^2
    Best-case runtime: n^2
    In-place: yes
    Stable: no
     */

    public static void sort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }

        int N = arr.length;
        for (int i = 0; i < N; i++) {
            int minIndex = i;
            for (int j = i + 1; j < N; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            swap(i, minIndex, arr);
        }
    }

    public static void swap(int i, int j, int[] arr) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
