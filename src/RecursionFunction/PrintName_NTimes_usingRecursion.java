package RecursionFunction;

public class PrintName_NTimes_usingRecursion {
    public static void printName(int number){
        if(number>0){
            System.out.println("Rushabh !");
            printName(number-1);
        }
    }

    public static void main(String[] args) {
        printName(1);
    }
}
