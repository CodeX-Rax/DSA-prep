package Advance_Pattern_Question_ForLoop;

public class SolidRhombus {
    public static void main(String[] args) {
        int n=5;
        for (int i=1;i<=n;i++){
            //spaces
            for (int j=1;j<=(n-i);j++){
                System.out.print("  ");
            }
            //stars
            for (int j=1;j<=5;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
