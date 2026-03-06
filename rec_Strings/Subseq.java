package rec_Strings;

import java.util.ArrayList;

public class Subseq {

    public static void main(String[] args) {
       
        System.out.println(SubSeqAsciiRet("", "abc"));
    }

    static void SubSeq(String a , String g){
        if(g.isEmpty()) {
            System.out.println(a);
            return;
        }

        char ch = g.charAt(0);
        SubSeq(a+ch , g.substring(1)  );
        SubSeq(a, g.substring(1));
        
        
    }
    static ArrayList<String> SubSeqRet(String a , String g){
        if(g.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(a);
            return list;
        }

        char ch = g.charAt(0);
        ArrayList<String> left = SubSeqRet(a+ch , g.substring(1)  );
        ArrayList<String> right = SubSeqRet(a, g.substring(1));
        left.addAll(right);
        return left;
    }
    static  void SubSeqAscii(String a , String g){
        if(g.isEmpty()) {
            System.out.println(a);
            return;
        }

        char ch = g.charAt(0);
        SubSeqAscii(a+ch , g.substring(1)  );
        SubSeqAscii(a, g.substring(1));
        SubSeqAscii(a+(ch+0) , g.substring(1));
        
        
    }
    static ArrayList<String> SubSeqAsciiRet(String a , String g){
         if(g.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(a);
            return list;
         }
         char ch = g.charAt(0);
         ArrayList<String> ist = SubSeqAsciiRet(a + ch, g.substring(1));
         ArrayList<String> second = SubSeqAsciiRet(a , g.substring(1));
         ArrayList<String> third = SubSeqAsciiRet(a + (ch +0) , g.substring(1));

         ist.addAll(second);
         ist.addAll(third);
         return ist;

    }
    
}
