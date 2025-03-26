package RecursionFunction;

public class FactorialOfN_Number {
    public static void factorial(int number){
        int factorial=1;
        for(int i=1;i<=number;i++){
            factorial=factorial*i;
        }
        System.out.println("Factorial of "+number+" is : "+factorial);
    }

    public static void main(String[] args) {
        factorial(5);
    }
}
