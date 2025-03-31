package ArrayEasyProblems;

public class SecondLargestElementInArray {
    public static void main(String[] args) {
        int[] arr = {12, 35, 1, 10, 34, 1};

        // Call the function to find the second largest
        int secondLargest = findSecondLargest(arr);

        System.out.println("The second largest number is: " + secondLargest);
    }

    public static int findSecondLargest(int[] arr) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > largest) {
                secondLargest = largest;  // Update second largest to previous largest
                largest = num;            // Update largest to current number
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;      // Update second largest if current number is between largest and second largest
            }
        }

        return secondLargest;
    }
}
