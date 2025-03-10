package Basic_Questions;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ask user for the number of terms in the Fibonacci series
        System.out.print("Enter the number of terms: ");
        int terms = sc.nextInt();

        // First two terms of the Fibonacci series
        int firstTerm = 0, secondTerm = 1;

        System.out.println("Fibonacci Series up to " + terms + " terms:");

        for (int i = 1; i <= terms; i++) {
            System.out.print(firstTerm + " ");

            // Calculate the next term by summing the previous two
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }

        //sc.close();
    }
}
