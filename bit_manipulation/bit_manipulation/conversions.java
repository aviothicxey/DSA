package bit_manipulation;
//convert a decimal number to binary and vice versa:
 public class conversions{
    public static String convert(int n){
        StringBuilder sb = new StringBuilder();

        while( n > 0){
            if(n % 2 == 1) sb.append('1');
            else sb.append('0');

            n = n/2;
        }
        return sb.reverse().toString(); 
    }

    public static int convert2Decimal(String n){
         int len = n.length(); int res = 0;
         for( int i = len-1 ; i >= 0 ; i--){
            res += (n.charAt(i) - '0') * Math.pow(2, len - i - 1);
         }
         return res;
    }
    public static void main(String[] args){
        int n = 13;
        String res = convert(n);
        System.out.println(res);
        int ans = convert2Decimal("1101");
        System.out.println(ans);
        
    }
}