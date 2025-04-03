package ArrayEasyProblems;

public class Maximum_Consecative_Of_One {
    public static void main(String[] args) {
        // Example 1
        int[] nums1 = {1, 1, 0, 1, 1, 1};
        System.out.println("Maximum Consecutive Ones: " + findMaxConsecutiveOnes(nums1));

        // Example 2
        int[] nums2 = {0, 0, 0, 0};
        System.out.println("Maximum Consecutive Ones: " + findMaxConsecutiveOnes(nums2));

        // Example 3
        int[] nums3 = {1, 1, 1, 1, 1};
        System.out.println("Maximum Consecutive Ones: " + findMaxConsecutiveOnes(nums3));

        // Example 4
        int[] nums4 = {1, 0, 1, 1, 0, 1, 1, 1, 0};
        System.out.println("Maximum Consecutive Ones: " + findMaxConsecutiveOnes(nums4));
    }

    public static int findMaxConsecutiveOnes(int[] nums) {
        int currentCount = 0;
        int maxCount = 0;

        for (int num : nums) {
            if (num == 1) {
                currentCount++;
                maxCount = Math.max(maxCount, currentCount);
            } else {
                currentCount = 0;
            }
        }

        return maxCount;
    }
}
