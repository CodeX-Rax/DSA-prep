package RecursionFunction;

public class ReverseAnArray {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int n=arr.length;
        reverseArray(arr,n);
    }
    public static void reverseArray(int arr[],int n){
        //array element are
        System.out.print("Before Array Reversing : ");
        for (int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.print("After Array Reversing array becomes : ");
        for (int i=n-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
    }
}
