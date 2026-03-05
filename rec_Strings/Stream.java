package rec_Strings;

public class Stream {
    
    public static void main(String[] args){
        skip("" , "bbachadahaeerh");
        String ans = skip2("Aparna");
        System.out.println(ans);
        System.out.println(skipApple("ansappleabc"));
        System.out.println(skipAppNotApple("appappleabcappleapp"));
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
    static String skipApple(String g){
        if(g.isEmpty()) return "";

        if(g.startsWith("apple")){
            return skipApple(g.substring(5));
        }else{
            return g.charAt(0) + skipApple(g.substring(1));
        }
    }

    static String skipAppNotApple(String g){
        if(g.isEmpty()) return "";

        if(g.startsWith("app") && !g.startsWith("apple")){
            return skipAppNotApple(g.substring(3));
        }else{
            return g.charAt(0) + skipAppNotApple(g.substring(1));
        }
    }

}
