package RecursionFunction;

public class Print_NTo_1TimeUsingRecursion {
    static void func(int i, int n){
        if(i<1)return;
            System.out.println(i);
            func(i- 1,n);
    }
    public static void main(String[] args) {
        int n = 4;
        func(n,n);
    }
}
