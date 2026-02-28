public class recursion_prac {
    static void fun(int n ){
        if(n == 0) return;
        
        System.out.println(n);
        fun(n-1);
    }

    static int sumOfDigits(int n){
        
    }
    public static void main(String args[]){
        fun(5);
    }
}
