package Patterns;

public class triangle {
    public static void main(String[]args){
        int n = 4;
        print(n, 0);
    }
    static void print(int r , int c){
        if(r <= 0) return;
        if( r > c) {
            System.out.print("*");
            print(r , c+1);
        }else{
            System.out.println();
            print(r-1 , 0);
        }
    }
}
