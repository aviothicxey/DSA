package bit_manipulation;

public class tricks {
    public static int clearithBit(int N , int K){
        return N & ~(1<<K);
    }
    public static int toggleithBit(int N , int K){
        return N ^ (1<<K);
    }
    public static int removeLastSetBit(int N){
        return N & (N-1);
    }
    public static boolean checkPowerOfTwo(int N){
        return (N & (N-1)) == 0;
    }
    public static int  countSetBits(int N){
        int cnt = 0;
        while( N > 0){
            cnt += N & 1;
            N = N >> 1;
        }
        return cnt;
    }
    public static int countSetBitsOptimized(int N){
        int cnt = 0;
        while( N > 0){
            N = N & (N-1);
            cnt++;
        }
        return cnt;
    }
    public static int countSetBitBuildIn(int N){
        return Integer.bitCount(N);
    }
    public static void main(String[] args) {
        System.out.println(clearithBit(13, 2)); 
        System.out.println(toggleithBit(13, 2));
        System.out.println(removeLastSetBit(13));
        System.out.println(checkPowerOfTwo(16));
        System.out.println(checkPowerOfTwo(15));
        System.out.println(countSetBits(13));
        System.out.println(countSetBitsOptimized(13));
        System.out.println(countSetBitBuildIn(13));
    }
}
