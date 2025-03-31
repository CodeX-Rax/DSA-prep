package ArrayEasyProblems;

import java.util.Arrays;

public class Largest_Element_In_Array {
    private static int largestElement(int arr[]){
        Arrays.sort(arr);
        return arr[arr.length-1];
    }
    public static void main(String[] args) {
        int arr[]={1,23,4,32,43,88,65,2,34,5,7,8,87,54,55,3,35,56,};
        System.out.println("Array Elements are : ");
        for (int x:arr){
            System.out.print(x+" ");
        }
        System.out.println();
        System.out.println("Largest element among array is "+largestElement(arr));
    }
}
