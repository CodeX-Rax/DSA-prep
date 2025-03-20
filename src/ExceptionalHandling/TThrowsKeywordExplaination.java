package ExceptionalHandling;

public class TThrowsKeywordExplaination {
    public static void division(int nr,int dr)throws ArithmeticException{
        System.out.println("Result of division is "+nr/dr);
    }
    public static void main(String[] args) {
        division(10,0);

    }
}
