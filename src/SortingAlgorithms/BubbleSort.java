package SortingAlgorithms;

public class BubbleSort {
    public static void bubbleSort(int[] arr) {
        int n = arr.length;

        // Traverse through all array elements
        for (int i = 0; i < n - 1; i++) {
            // Last i elements are already in place, no need to check them
            for (int j = 0; j < n - 1 - i; j++) {
                // Swap if the element found is greater than the next element
                if (arr[j] > arr[j + 1]) {
                    // Swap the elements
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println("Sorted array:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }


    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        System.out.println("Unsorted array:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
        bubbleSort(arr);

    }

}
