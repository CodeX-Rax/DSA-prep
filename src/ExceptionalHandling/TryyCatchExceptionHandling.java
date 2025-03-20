package ExceptionalHandling;

import java.util.Scanner;

public class TryyCatchExceptionHandling {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Numerator : ");
        int nr=scanner.nextInt();
        System.out.println("Enter Denominator : ");
        int dr=scanner.nextInt();
        try {
            int result=nr/dr;
            System.out.println("Result is "+result);
        }catch (ArithmeticException e){
            System.out.println(e);
        }

    }
}
