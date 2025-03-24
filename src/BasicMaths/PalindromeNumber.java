package BasicMaths;

import java.util.Scanner;

public class PalindromeNumber {
    static boolean palindrome(int n) {

        int reverseNumber = 0;
        int dup = n;
        while (n > 0) {
            int last_digit = n % 10;
            reverseNumber = (reverseNumber * 10) + last_digit;
            // Remove the last digit
            // from the original number
            n = n / 10;
        }
        if (dup == reverseNumber) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number : ");
        int number = scanner.nextInt();

        if (palindrome(number)) {
            System.out.println(number + " is a palindrome.");
        } else {
            System.out.println(number + " is not a palindrome.");
        }
    }
}
