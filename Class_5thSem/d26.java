package Class_5thSem;

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
        } else {
            System.out.println("All numbers are equal");
        }
    }
}
