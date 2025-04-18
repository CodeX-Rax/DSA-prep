package ArrayEasyProblems;

public class Find_the_missing_number_in_array {
    public static int missingNumber(int []a, int N) {

        //Summation of first N numbers:
        int sum = (N * (N + 1)) / 2;

        //Summation of all array elements:
        int s2 = 0;
        for (int i = 0; i < N - 1; i++) {
            s2 += a[i];
        }

        int missingNum = sum - s2;
        return missingNum;
    }

    public static void main(String args[]) {
        int N = 9;
        int a[] = {1, 2, 3,4, 5,6,8,9};

        int ans = missingNumber(a, N);
        System.out.println("The missing number is: " + ans);
    }
}
