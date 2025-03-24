package BasicMaths;

import java.util.Scanner;

public class ReverseTheNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter the number: ");
            int n = scanner.nextInt();

            // Handle negative numbers by remembering the sign
            boolean isNegative = n < 0;
            if (isNegative) {
                n = -n; // Make the number positive for easier processing
            }

            int reverse_number = 0;
            // Reverse the digits of the number
            while (n > 0) {
                int last_digit = n % 10;
                reverse_number = (reverse_number * 10) + last_digit;
                n = n / 10;
            }

            // If the number was negative, convert the reversed number back to negative
            if (isNegative) {
                reverse_number = -reverse_number;
            }

            // Print the reversed number
            System.out.println("Reversed number: " + reverse_number);
        } finally {
            scanner.close(); // Always close the scanner to avoid resource leakage
        }
    }
}

