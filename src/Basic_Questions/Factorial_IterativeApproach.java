package Basic_Questions;

import java.util.Scanner;

public class Factorial_IterativeApproach {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Calculate factorial using iterative method
        long factorial = 1;

        for (int i = 1; i <= number; i++) {
            factorial *= i;  // Multiply factorial by i at each iteration
        }

        System.out.println("Factorial of " + number + " is: " + factorial);

        //sc.close();
    }
}
