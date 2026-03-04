package array_recursion;

public class rbs {
    public static void main(String[]args){
        int arr[] = {6,7,8,9,1,2,3};
        int ans =findIndex(arr, 0, arr.length-1, 2);
        System.out.println(ans);

    }
    static int findIndex(int arr[] , int s, int e , int target){
        if(s > e) return -1;
        int m = s + (e-s) / 2;
        if(target == arr[m]) return m;
        if(arr[s] <= arr[m]){
            if(arr[s] <= target && arr[m] >= target){
                return findIndex(arr, s, m-1, target);
            }else{
                return findIndex(arr , m+1 , e , target);
            }
        }else{
            if(arr[m] <= target && arr[e] >= target){
                return findIndex(arr , m+1 , e , target);
            }else{
                return findIndex(arr, s, m-1 , target);
            }
        }
    }
}
