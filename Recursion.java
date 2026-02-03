import java.util.*;
public class Recursion{
// print name n times:
    static void printName(int n){
        if(n == 0) return;
        System.out.println("Aparna");
        printName(n-1);
    }
    static void pn(int i,int n){
        if(i > n) return;
        System.out.println("Ayush");
        pn(i+1 , n);
    }
// print numbers 1 to n:
    static void printNum(int i , int n){
        if( i > n ) return;
        System.out.println(i);
        printNum(i+1, n);
    }
// with backtracking:
    static void printn(int i , int n){
        if( i < 1) return;
        printn(i-1, n);
        System.out.println(i);
    }
    static void bpn(int i , int n){
        if(i > n) return;
        bpn(i+1 , n);
        System.out.println(i);
    }
    // sum of n numbers:(Paramtrized):
    static void sumOfN(int i , int sum){
        if(i < 1){
            System.out.println(sum);
            return;
        }
        sumOfN(i-1, sum+i);
    }
    // sum of n numbers(functional):
    static int fun(int n){
    if(n == 0) return 0;
    return n+fun(n-1);
    }
    // factorial of ist n numbers:
    static int fact(int n){
        if( n == 0) return 1;
        if( n == 1) return 1;
        return n * fact(n-1);
    }
    //reverse an array :
    static void reverseArray(int i ,int n , int[] arr){
        if( i >= n /2){
            return;
        }
        swap(i, n-i-1 , arr);
        reverseArray(i+1, n, arr);
    }
    static void swap(int i , int j , int[] arr){
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
    // check if the string is palindrome or not:
    static boolean isPalindrome(int i,int n ,String s){
        if(i >= n/2) return true;
        if(s.charAt(i) != s.charAt(n-i-1)) return false;
        return isPalindrome(i+1, n, s);
    }
    //FIBONNACI NUMBER:
    static int fibonacci(int n){
        if(n<=1)return n;
        int last = fibonacci(n-1);
        int slast = fibonacci(n-2);
        return last + slast;
    }
    //print the subsequence
    static void Subseq(int ind , ArrayList<Integer> ds, int[] arr , int n){
        if(ind >= n){
            System.out.println(ds);
            return;
        }
        ds.add(arr[ind]);
        Subseq(ind +1 , ds ,arr , n);
        ds.remove(ds.size()-1);
        Subseq(ind+1 , ds,arr,n);
    }
    //print subsequenc whose sum is K:
    static void SumK(int ind , ArrayList<Integer> ds , int sum ,int k , int[]arr , int n){
        if(ind == n){
            if(sum == k) System.out.println(ds);
            return;
        }
        ds.add(arr[ind]);
        SumK(ind +1 , ds , sum+arr[ind] ,k , arr,n);
        ds.remove(ds.size()-1);
        SumK(ind + 1, ds, sum , k, arr, n);
    }
    // count the subsequence whose sum is k
    static int countSEq(int ind , int sum , int k , int[] arr , int n){
        if(ind == n){
            if(sum == k) return 1;
            return 0;
        }
        sum += arr[ind];
        int left = countSEq(ind+1, sum, k, arr, n);
        sum -= arr[ind];
        int right = countSEq(ind + 1, sum, k, arr, n);
        return left + right;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt() ;
        //  printName(n); // Aparna n times
        //  pn(1,n); // ayush n times
        //  printNum(1, n); //1 to n normal recursion
        //  printn(n, n); //1 to n(backtracing)
        //  bpn(1, n);//n to 1 (backtracking)
        //  sumOfN(n,0);
        //  int res = fun(n);
        //  System.out.println(res);
        //  int factorial = fact(n);
        //  System.out.println(factorial);
        //  int[] arr = new int[n];
        //  for(int i = 0 ; i < n ; i++){
        //     arr[i] = sc.nextInt();
        //  }
        //  reverseArray(0, n, arr);
        //  for(int i = 0 ; i < n ; i++){
        //     System.out.println(arr[i]);
        //  }
        //  String x = sc.next();
        //  boolean p = isPalindrome(0, x.length(), x);
        //  System.out.println(p);
        //  System.out.println(fibonacci(5));
        //  int v= 3;
        //  int[] a = {3, 2,1};
        //  ArrayList<Integer> ds = new ArrayList<>();
        //  Subseq(0,ds,a,v);

        // int[] arr = {1,2,1};
        // int k = 2;
        // ArrayList<Integer> ds = new ArrayList<>();
        // SumK(0, ds, 0, k, arr, arr.length);
        int arr[] = {1,2,1};
        int k = 2;
        int n = arr.length;
        int count = countSEq(0, 0, k, arr, n);
        System.out.println(count);

         sc.close();
    }
    
}//