package array_recursion;

public class linearSearch {
    public static void main(String[]args){
        int[]arr = {1,2,3,4,13,5,6,7,15,70,13,8,9};
        
        // int indexOfTarget = findIndex(arr, tar, 0);
        // System.out.println(indexOfTarget);

        // System.out.println(Index(arr,tar,0));

        int fromLast = findIndexFromLast(arr, 13, arr.length-1);
        System.out.println(fromLast);

    }
    static int findIndex(int[]arr,int target,int ind){
        if(ind == arr.length-1) return -1;
        if(arr[ind] == target) return ind;
        return findIndex(arr, target, ind+1);
    }
    static boolean Index(int[]arr,int target,int ind){
        if(ind == arr.length) return false;
        return arr[ind] == target || Index(arr, target, ind+1);
    }
    static int findIndexFromLast(int[]arr,int tar ,int ind){
        if(ind == -1) return -1;
        if(arr[ind] == tar) return ind;
        return findIndexFromLast(arr, tar, ind-1);

    }
}
