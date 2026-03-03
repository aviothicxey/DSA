package array_recursion;

public class isSorted {
    public static void main(String[]args){
        int[]arr = {1,2,3,4,5,6};
        System.out.println(Sorted(arr, 0));

    }
    static boolean Sorted(int[]arr , int ind){
        if(ind == arr.length-1){
            return true;
        }
        return arr[ind]<arr[ind+1] && Sorted(arr, ind+1);
    }
}
