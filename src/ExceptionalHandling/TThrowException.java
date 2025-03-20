package ExceptionalHandling;

import java.util.Scanner;

public class TThrowException {
    //throw is used to throw exception by our own.we decide to throw an exception
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int age=scanner.nextInt();
        if(age>=18){
            System.out.println("You are an adult..., ");
        }else {
            throw new RuntimeException("you are not an adu;t..., ");
        }
    }
}
