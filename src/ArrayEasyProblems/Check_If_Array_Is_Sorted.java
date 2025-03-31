package ArrayEasyProblems;

public class Check_If_Array_Is_Sorted {
    static int isSorted(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[i])
                    return -1;
            }
        }

        return 1;
    }

    public static void main(String args[]) {
        int arr[] = {1, 2, 3, 4, 5}, n = 5;

        System.out.println(isSorted(arr, n));
    }
}
