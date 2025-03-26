package BasicMaths;

public class SumOfDivisors {
    public static int sumOfDivisors(int n) {
        int ans=0;
        for(int i=1;i<=n;i++)
        {
            int sum=0;
            for(int j=1;j<=i;j++)
            {
                if(i%j==0)
                {
                    sum+=j;
                }
            }
            ans+=sum;
        }
        return ans;
    }

    public static void main(String[] args) {
        int number=4;
        System.out.println(sumOfDivisors(number));
    }
}
