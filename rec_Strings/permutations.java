package rec_Strings;

import java.util.ArrayList;

public class permutations {
    public static void main(String[] args) {
        permutation("", "abc");
            ArrayList<String> ans = permutationRet("", "abc");
            System.out.println(ans);
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
    static ArrayList<String> permutationRet(String a ,String g){
        if(g.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(a);
            return list;
        }
        char ch = g.charAt(0);
        ArrayList<String> ans = new ArrayList<>();
        for(int i = 0 ; i <= a.length(); i++){
            String f = a.substring(0,i);
            String s = a.substring(i,a.length());
            ans.addAll(permutationRet(f + ch + s, g.substring(1)));
        }
        return ans;
    }
}
