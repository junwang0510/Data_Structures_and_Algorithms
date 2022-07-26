package Sorting;

public class BubbleSort {

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
        for (int end = N - 1; end >= 0; end--) {
            for (int second = 1; second <= end; second++) {
                if (arr[second - 1] > arr[second]) {
                    swap(arr, second - 1, second);
                }
            }
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
