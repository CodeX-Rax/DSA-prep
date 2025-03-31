package SearchingAlgorithm;

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

/*
Applications of Linear Search Algorithm:
Unsorted Lists: When we have an unsorted array or list, linear search is most commonly used to find any element in the collection.
Small Data Sets: Linear Search is preferred over binary search when we have small data sets with
Searching Linked Lists: In linked list implementations, linear search is commonly used to find elements within the list. Each node is checked sequentially until the desired element is found.
Simple Implementation: Linear Search is much easier to understand and implement as compared to Binary Search or Ternary Search.

Advantages of Linear Search Algorithm:
Linear search can be used irrespective of whether the array is sorted or not. It can be used on arrays of any data type.
Does not require any additional memory.
It is a well-suited algorithm for small datasets.

Disadvantages of Linear Search Algorithm:
Linear search has a time complexity of O(N), which in turn makes it slow for large datasets.
Not suitable for large arrays.

When to use Linear Search Algorithm?
When we are dealing with a small dataset.
When you are searching for a dataset stored in contiguous memory.
*/
