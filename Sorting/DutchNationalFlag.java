package Sorting;

public class DutchNationalFlag {

    /*
    Rearrange the elements of the array so that all the negative (< 0) elements come first,
    followed by all of the zeros (== 0), followed by all of the positive (> 0) elements.
     */

    /*
    Runtime: O(n)
    In-place: yes
    Stable: no
     */

    public static void sort(int[] arr) {
        // break into 4 sections: <0, =0, unknown, >0 with i, j, and k
        int i = 0;
        int j = 0;
        int k = arr.length;

        // ends when j == k -> no more unknowns
        while (j < k) {
            int val = arr[j];
            if (val < 0) {
                swap(arr, i, j);
                i++;
                j++;
            } else if (val == 0) {
                j++;
            } else {
                swap(arr, j, k - 1);
                k--;
            }
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
