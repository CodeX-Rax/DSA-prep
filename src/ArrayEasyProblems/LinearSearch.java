package ArrayEasyProblems;

import java.util.Scanner;

public class LinearSearch {
    public static int search(int arr[],int x){
        for (int i=0;i<arr.length;i++){
            if (arr[i]==x){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={23,43,1,3,44,54,2,345,21,789};

        System.out.println("Which Element you wants to search ? ");
        Scanner scanner=new Scanner(System.in);
        int x=scanner.nextInt();

        int result=search(arr,x);
        if (result==-1){
            System.out.println("Element not present in array !");
        }else {
            System.out.println("Element is present in index : "+result);
        }
    }
}
