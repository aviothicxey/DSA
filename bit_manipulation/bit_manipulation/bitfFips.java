package bit_manipulation;

public class bitfFips {
    public static int noOfBitsFlipToMakeAtoB(int A  , int B){
        int ans = A ^ B;
        return Integer.bitCount(ans);
    }
    public static void main(String[] args) {
        System.out.println(noOfBitsFlipToMakeAtoB(10, 20)); 
    }
}
