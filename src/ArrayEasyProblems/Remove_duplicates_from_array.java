package ArrayEasyProblems;

public class Remove_duplicates_from_array {
    public static int removeDuplicates(int arr[]){
        int i=0;
        for (int j=1;j<arr.length;j++){
            if (arr[i]!=arr[j]){
                i++;
                arr[i]=arr[j];
            }
        }
        return i+1;
    }

    public static void main(String[] args) {
        int arr[]={1,1,2,2,2,34,5,5,6,7,8,8,9};
        System.out.println("before removing duplicate element array become : ");
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        int res=removeDuplicates(arr);
        System.out.println("After removing duplicate element array become : ");
        for (int i=0;i<res;i++){
            System.out.print(arr[i]+" ");
        }

    }
}
