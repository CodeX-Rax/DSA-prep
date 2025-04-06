package ArrayEasyProblems;

public class NumberThatAppearsOnceAndOthersTwice {
    public static void main(String[] args) {
        // Example input array
        int[] nums = {4, 1, 2, 1, 2};

        // Call the function to find the number that appears once
        int singleNumber = findSingleNumber(nums);

        // Output the result
        System.out.println("The number that appears once is: " + singleNumber);
    }

    public static int findSingleNumber(int[] nums) {
        int result = 0;

        // XOR all numbers in the array
        for (int num : nums) {
            result ^= num;
        }

        // The result will hold the number that appears only once
        return result;
    }
}


/*
 X-OR
A B   Y
0 0   0
0 1   1
1 0   1
1 1   0

Step 1: Start with result = 0.

We will XOR each number in the array with result.

Step 2: XOR with the first number 4:

result = 0 ^ 4 = 4

Now, result is 4.

Step 3: XOR with the second number 1:

result = 4 ^ 1 = 5

Now, result is 5.

Step 4: XOR with the third number 2:

result = 5 ^ 2 = 7

Now, result is 7.

Step 5: XOR with the fourth number 1 (which is a repeat):

result = 7 ^ 1 = 6

Now, result is 6.

Step 6: XOR with the fifth number 2 (which is also a repeat):

result = 6 ^ 2 = 4

Now, result is 4.
*/
