public class TRY {
    public static boolean Armstrong(int num){
        int n=num;
        int k=String.valueOf(num).length();
        int sum=0;
        while(n>0){
            int ld=n%10;
            sum+=Math.pow(ld,k);
            n=n/10;
        }
        return sum==num ? true:false;

    }
    public static void main(String[] args) {
        int n=186;
        if(Armstrong(n)){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
    }
}
