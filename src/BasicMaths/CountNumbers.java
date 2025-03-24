package BasicMaths;

import java.util.Scanner;

public class CountNumbers {
    public static int countDigits(int n) {
        // Handle the edge case where n is 0
        if (n == 0) {
            return 1;
        }
        // Using Math.log10 for faster calculation of the number of digits
        return (int) Math.log10(n) + 1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter the number: ");
            int N = scanner.nextInt();
            int digits = countDigits(N);
            System.out.println("Number of digits in " + N + ": " + digits);
        } finally {
            scanner.close(); // Ensuring the scanner is closed after use
        }
    }
}

