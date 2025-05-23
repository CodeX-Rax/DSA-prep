package Advance_Pattern_Question_ForLoop;

public class ButterflyPattern {
    public static void main(String[] args) {
        int n=4;
        //upper-half
        for (int i=1;i<=n;i++){
            //stars
            for (int j=1;j<=i;j++){
                System.out.print("* ");
            }
            //spaces
            int spaces=2*(n-i);
            for (int j=1;j<=spaces;j++){
                System.out.print("  ");
            }
            //stars
            for (int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        //lower-half
        for (int i=n;i>=1;i--){
            //stars
            for (int j=1;j<=i;j++){
                System.out.print("* ");
            }
            //spaces
            int spaces=2*(n-i);
            for (int j=1;j<=spaces;j++){
                System.out.print("  ");
            }
            //stars
            for (int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
