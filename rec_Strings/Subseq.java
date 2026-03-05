package rec_Strings;

public class Subseq {

    public static void main(String[] args) {
        SubSeq("","abc");
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
    
}
