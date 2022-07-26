package Sorting;

public class MergeSort {

    /*
    Runtime: nlogn
    In-place: no
    Stable: yes
     */

    public static void sort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        mergeSort(arr, 0, arr.length - 1);
    }

    public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }

    public static void merge(int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int arr1[] = new int[n1];
        int arr2[] = new int[n2];

        // Fill the two arrays
        for (int i = 0; i < n1; i++) {
            arr1[i] = arr[left + i];
        }
        for (int i = 0; i < n2; i++) {
            arr2[i] = arr[mid + i + 1];
        }

        // Use 3 pointers to override the merged array
        int i = 0; // arr1
        int j = 0; // arr2
        int k = left; // merge
        while (i < n1 && j < n2) {
            if (arr1[i] <= arr2[j]) {
                arr[k] = arr1[i];
                i++;
            } else {
                arr[k] = arr2[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            arr[k] = arr1[i];
            i++;
            k++;
        }
        while (j < n2) {
            arr[k] = arr2[j];
            j++;
            k++;
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
