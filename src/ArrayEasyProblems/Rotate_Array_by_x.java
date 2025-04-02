package ArrayEasyProblems;

import java.util.Scanner;

public class Rotate_Array_by_x {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter by how many term you wanted to rotate array : ");
        int k = scanner.nextInt();

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
    }
}
