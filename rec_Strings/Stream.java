package rec_Strings;

public class Stream {
    
    public static void main(String[] args){
        skip("" , "bbachadahaeerh");
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

}
