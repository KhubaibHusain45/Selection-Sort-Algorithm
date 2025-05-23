package Sorting;

public class SelectionSort {
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {7, 8, 3, 1, 2};
        // Time Complexity=O(n^2)
//        Outer Loop: Iterates through each index of the array.
        for (int i = 0; i < arr.length - 1; i++) {
            int smallest = i;
//            Inner Loop: Finds the smallest element in the remaining unsorted portion.
          /*  If arr = {7, 8, 3, 1, 2}
            When i = 0 (value is 7), j starts from i + 1 = 1 (value is 8), and compares 7 with 8, 3, 1, 2.
            When i = 1 (value is 8), j = 2, and compares 8 with 3, 1, 2.
            And so on.*/
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[smallest] > arr[j]) {
                    smallest = j;
                }
            }
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }
        printArray(arr);
    }
}
