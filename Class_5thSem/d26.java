package Class_5thSem;
import java.util.*;
public class d26 {
    public static void main(String[] args) {
        // second largest when all distinct numbers
        int a = 10;
        int b = 15;
        int c = 20;
        if(a > b && a > c){
            if(b > c){
                System.out.println("b is second largest");
            } else {
                System.out.println("c is second largest");
            }
        }
        else if(b > a && b > c){
            if(a > c){
                System.out.println("a is second largest");
            } else {
                System.out.println("c is second largest");
            }
        } else if(c > a && c > b){
            if(a > b){
                System.out.println("a is second largest");
            } else {
                System.out.println("b is second largest");
            }
        } else {
            System.out.println("All numbers are equal");
        }


        //second largest if 2 numbers are equal

        int p = 10;
        int q = 20;
        int r = 20;

        if(p == q && q == r){
            System.out.println("All numbers are equal");
        } else if(p == q){
            if(p > r){
                System.out.println("r is second largest");
            } else {
                System.out.println("p is second largest");
            }
        } else if(q == r){
            if(q > p){
                System.out.println("p is second largest");
            } else {
                System.out.println("q is second largest");
            }
        } else if(p == r){
            if(p > q){
                System.out.println("q is second largest");
            } else {
                System.out.println("p is second largest");
            }
        } else {
            if(p > q && p > r){
                if(q > r){
                    System.out.println("q is second largest");
                } else {
                    System.out.println("r is second largest");
                }
            } else if(q > p && q > r){
                if(p > r){
                    System.out.println("p is second largest");
                } else {
                    System.out.println("r is second largest");
                }
            } else if(r > p && r > q){
                if(p > q){
                    System.out.println("p is second largest");
                } else {
                    System.out.println("q is second largest");
                }
            }
        }

        // count the number of setbits in a number
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int cnt =0 ;
        while(num > 0){
            if((num & 1) == 1){
                cnt++;
            }
            num = num >> 1;
        }
        System.out.println(cnt);
        sc.close();
    }
    
}
