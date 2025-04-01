package ArrayEasyProblems;

public class Left_Rotate_the_Array_by_One {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        // Call the function to left rotate the array by one
        leftRotateByOne(arr);

        // Print the rotated array
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void leftRotateByOne(int[] arr) {
        // Step 1: Store the first element
        int first = arr[0];

        // Step 2: Shift all elements to the left by one position
        for (int i = 1; i < arr.length; i++) {
            arr[i - 1] = arr[i];
        }

        // Step 3: Place the first element at the end
        arr[arr.length - 1] = first;
    }
    /*public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;

        // Call the function to rotate the array
        rotate(nums, k);

        // Print the rotated array
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    public static void rotate(int[] nums, int k) {
        int n = nums.length;

        // Normalize k to avoid unnecessary rotations
        k = k % n;

        // Step 1: Reverse the entire array
        reverse(nums, 0, n - 1);

        // Step 2: Reverse the first k elements
        reverse(nums, 0, k - 1);

        // Step 3: Reverse the remaining elements
        reverse(nums, k, n - 1);
    }

    // Helper method to reverse a portion of the array
    public static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            // Swap the elements at start and end
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }*/
}
