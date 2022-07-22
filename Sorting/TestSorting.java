package Sorting;

public class TestSorting {
    public static void main(String[] args) {
        int[] arr = {-1, 2, 3, 10, 5, 8, 0, 1, -23, -50, 17, 28, 3, 0};
        System.out.println("Before Sorting:");
        printArr(arr);
        System.out.println();
        // Sorting algorithm to be inserted
        System.out.println("After Sorting:");
        printArr(arr);
    }

    public static void printArr(int[] arr) {
        for(int num : arr) {
            System.out.println(num + " ");
        }
        System.out.println();
    }
}
