// public class rec_countZeros {
//     static int Fun(int n , int cnt){
//         if(n==0) return cnt;
//         int rem = n % 10;
//         if( rem  == 0){
//             return Fun(n/10 , cnt+1);
//         }
//         return Fun(n/10,cnt);
//     }
//     public static void main(String[] args){
//         int ans = Fun(1203060050 , 0);
//         System.out.println(ans);
//     }
// }

//or

public class rec_countZeros{
    static int count(int n){
        return helper(n,0);
    }
    static int helper(int n , int cnt){
        if(n == 0) return cnt;
        int rem = n% 10 ;
        if(rem == 0){
            return helper(n/10, cnt+1);
        }
        return helper(n/10,cnt);
    }

    public static void  main(String[] args){
        int ans = count(100000);
        System.out.println(ans);
    }
}
