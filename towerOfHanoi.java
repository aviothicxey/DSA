public class towerOfHanoi{
    static void TowerOfHanoi(int n , char from , char to , char aux){
        if(n == 0) return;
        TowerOfHanoi(n -1 ,  from ,  aux ,  to);
        System.out.println("Disk " + n + " moved from " + from + " to " + to );
        TowerOfHanoi(n-1 , aux , to , from);
    }
    public static void main(String[] args){
        int n = 4;
        TowerOfHanoi(n , 'A' , 'C' , 'B');
    }
}