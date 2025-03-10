package Patter_Question_forLoop;

public class RightPyramid {
    public static void main(String[] args) {
        int n=4;
        for (int i=1;i<=n;i++){
            //loop to print space
            for (int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //loop to print *
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
