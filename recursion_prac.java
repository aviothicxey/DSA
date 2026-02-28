public class recursion_prac {
    static void fun(int n ){
        if(n == 0) return;
        
        System.out.println(n);
        fun(n-1);
    }

    static int sumOfDigits(int n){
        if(n==0) return 0;
        return n % 10 + sumOfDigits(n/10);
    }

    static int productOfDigits(int n){
        if( n == 0) return 1;
        return n% 10 * productOfDigits(n/10);
    }

    static int sum = 0;
    static void rev1(int n){
        if(n==0) return ;
        int rem = n % 10;
        sum = sum * 10 + rem;
        rev1(n/10);
        
    }

    static int rev2(int n){
        
    }
    public static void main(String args[]){
       // fun(5);
    //    int ans = sumOfDigits(123456);
    //    System.out.println(ans);

    // int ans = productOfDigits(5055);
    // System.out.println(ans);

    rev1(1234);
    System.out.println(sum);
    }
}
