package CLRS;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = new int[]{31, 41, 59, 26, 41, 58};
        sortIncreasing(arr);
        for (int i : arr) System.out.print(i + " ");
        System.out.println();
        sortDecreasing(arr);
        for (int i : arr) System.out.print(i + " ");
    }

    public static void sortIncreasing(int[] arr) {
        if (arr.length < 2) return;

        for (int i = 1; i < arr.length; i++) {
            int j = i;
            while (j - 1 >= 0 && arr[j - 1] > arr[j]) {
                swap(j - 1, j, arr);
                j--;
            }
        }
    }

    // 2.1.2
    public static void sortDecreasing(int[] arr) {
        if (arr.length < 2) return;

        for (int i = 1; i < arr.length; i++) {
            int j = i;
            while (j - 1 >= 0 && arr[j - 1] < arr[j]) {
                swap(j - 1, j, arr);
                j--;
            }
        }
    }

    private static void swap(int a, int b, int[] arr) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
