package ArrayEasyProblems;

public class LongestGivenSubArray {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1, 2, 3, 4, 5};  // Example array
        System.out.println("Length of largest subarray with distinct elements: " + findLargestSubarray(nums));
    }

    public static int findLargestSubarray(int[] nums) {
        int maxLength = 0;

        // Loop over all possible starting points of subarrays
        for (int start = 0; start < nums.length; start++) {
            boolean[] seen = new boolean[100000];  // Array to track the elements seen in the subarray
            boolean isValid = true;

            // Loop through the subarray starting at `start`
            for (int end = start; end < nums.length; end++) {
                int num = nums[end];

                // If the number is already seen in the subarray, break the loop
                if (seen[num]) {
                    isValid = false;
                    break;
                }

                // Mark the number as seen
                seen[num] = true;
            }

            // If the subarray is valid (all distinct), update the maxLength
            if (isValid) {
                maxLength = Math.max(maxLength, (nums.length - start));
            }
        }

        return maxLength;
    }
}
