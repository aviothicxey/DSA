package array_recursion;

public class linearSearch {
    public static void main(String[]args){
        int[]arr = {1,2,3,4,5,6,7,15,70,8,9};
        int tar = 70;
        int indexOfTarget = findIndex(arr, tar, 0);
        System.out.println(indexOfTarget);
    }
    static int findIndex(int[]arr,int target,int ind){
        if(ind == arr.length-1) return -1;
        if(arr[ind] == target) return ind;
        return findIndex(arr, target, ind+1);
    }
    
}
