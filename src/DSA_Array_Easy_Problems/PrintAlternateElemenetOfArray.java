package DSA_Array_Easy_Problems;

public class PrintAlternateElemenetOfArray {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9};
        System.out.println("Alternate Array Element are ....");
        for (int i=0;i<arr.length;i+=2){
            System.out.println(" "+arr[i]);
        }
    }
}
