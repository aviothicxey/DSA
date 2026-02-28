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
        if(n% 10 == n) return n;
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
        int digits = (int)(Math.log10(n))+1;
        return helper(n,digits);
    }
    private static int helper(int n , int arg){
        if(n % 10 == n){
            return n;
        }
        int rem = n % 10;
        return rem *(int)(Math.pow(10,arg-1)) + helper(n/10 , arg-1);
    }


    
    public static void main(String args[]){
       // fun(5);
    //    int ans = sumOfDigits(123456);
    //    System.out.println(ans);

    // int ans = productOfDigits(5055);
    // System.out.println(ans);

    // rev1(1234);
    // System.out.println(sum);

    // System.out.println(rev2(1234));
    }
}
