package Basic_Questions;

import java.util.Scanner;

public class SwapNumberWithoutThreeVar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        // Swapping using addition and subtraction
        a = a + b;  // a now holds the sum of a and b
        b = a - b;  // subtract b from the sum, giving the value of a
        a = a - b;  // subtract b (which is now a) from the sum, giving the value of b

        System.out.println("After swapping: ");
        System.out.println("First number: " + a);
        System.out.println("Second number: " + b);

        //sc.close();
    }
}
