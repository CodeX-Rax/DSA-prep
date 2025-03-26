package RecursionFunction;

public class IntroToRecursionFuntion {
    // Recursive function to print "Hello!" N times
    public static void printHello(int n) {
        if (n > 0) {
            System.out.println("Hello!");  // Print the message
            printHello(n - 1);  // Call the function with n-1
        }
    }

    public static void main(String[] args) {
        printHello(5);  // Call the function to print "Hello!" 5 times
    }
}
