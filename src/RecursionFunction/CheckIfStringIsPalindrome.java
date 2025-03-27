package RecursionFunction;

import java.util.Scanner;

public class CheckIfStringIsPalindrome {
    public static void isPalindrome(String s){
        //replaceAll() is used to replace something from string.
        String cleanString=s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        String reversed =new StringBuilder(cleanString).reverse().toString();
        if (cleanString.equals(reversed)){
            System.out.println(s +" is palindrome !");
        }else {
            System.out.println(s+ " is not palindrome !");
        }
    }

    public static void main(String[] args) {
        String string="A man, a plan, a canal: Panama";
        isPalindrome(string);
    }
}




/*Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the String : ");
String name=scanner.nextLine();
String lowerCase = name.toLowerCase();
String string=new StringBuilder(lowerCase).reverse().toString();
        if(string.equals(lowerCase)){
        System.out.println(" Number is Palindrome !");
        }else{
                System.out.println("Number is not Palindrome !");
        }*/
