package Basic_Questions;

import java.util.Scanner;

public class reversenuumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Reversing the number using simple logic
        int reversed = 0;
        while (number != 0) {
            reversed = reversed * 10 + number % 10;
            number /= 10;  // Remove the last digit
        }

        // Display the reversed number
        System.out.println("Reversed number: " + reversed);

        sc.close();
    }
}
