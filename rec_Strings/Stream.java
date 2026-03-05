package rec_Strings;

public class Stream {
    
    public static void main(String[] args){
        skip("" , "bbachadahaeerh");
        String ans = skip2("Aparna");
        System.out.println(ans);
    }

    static void skip(String a , String g){

        if(g.isEmpty()){
            System.out.println(a);;
            return;
        }
        char ch = g.charAt(0);
        if( ch == 'a'){
            skip(a , g.substring(1));
        }else{
            skip(a + ch , g.substring(1));
        }

    }

    static String skip2(String g){
        if(g.isEmpty()){
            return "";
        }
        char ch = g.charAt(0);
        if(ch == 'a'){
            return skip2(g.substring(1));
        }else{
            return ch +skip2(g.substring(1));
        }
    }

}
