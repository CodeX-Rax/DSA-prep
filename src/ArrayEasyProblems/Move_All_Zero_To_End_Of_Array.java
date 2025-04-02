package ArrayEasyProblems;

public class Move_All_Zero_To_End_Of_Array {
    public static void main(String[] args) {
        int[] nums = {0, 1, 9, 0, 2, 3, 0, 4, 5};

        // Move all zeros to the end
        moveZerosToEnd(nums);

        // Print the modified array
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    public static void moveZerosToEnd(int[] nums) {
        int index = 0;  // To track position for non-zero elements

        // Move all non-zero elements to the front
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[index] = nums[i];
                if (index != i) {
                    nums[i] = 0;
                }
                index++;
            }
        }
    }
}
