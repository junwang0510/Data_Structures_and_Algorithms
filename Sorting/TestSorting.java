package Sorting;

public class TestSorting extends DutchNationalFlag { // change the extended class for different sorting
    public static void main(String[] args) {
        int[] arr = {-1, 2, 3, 10, 5, 8, 0, 1, -23, -50, 17, 28, 3, 0};
        System.out.println("Before Sorting:");
        printArr(arr);
        System.out.println();
        sort(arr);
        System.out.println("After Sorting:");
        printArr(arr);
    }

    public static void printArr(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
