package rec_Strings;

public class permutations {
    public static void main(String[] args) {
        permutation("", "abc");
    }

    static void permutation(String a ,String g){
        if(g.isEmpty()){
            System.out.println(a);
            return;
        }
        char ch = g.charAt(0);
        for(int i = 0 ; i <= a.length(); i++){
            String f = a.substring(0,i);
            String s = a.substring(i,a.length());
            permutation(f + ch + s, g.substring(1));
        }
    }
}
