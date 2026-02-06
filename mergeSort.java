import java.util.*;
public class mergeSort {
    private static void mergeSortt(int[] arr , int low , int high ){
        if(low >= high){
            return;
        }
        int mid = low + (high - low)/2;
        mergeSortt(arr , low , mid);
        mergeSortt(arr, mid+1, high);
        merge(arr , low , mid , high);
    } 
    private static void merge(int[] arr , int start , int mid , int end){
        int temp[] = new int[end - start +1];
        int ind = 0 ;
        int left = start;
        int right = mid +1;
        while(left < mid && right < end){
            if(arr[left]<= arr[right]){
                temp[ind] = arr[left];
                left++;
                ind++;
            }else{
                temp[ind] = arr[right];
                right++;
                ind++;
            }
        }
        while(left <= mid){
            temp[ind] = arr[left] ;
            left++;
            ind++;
        }
        while(right <= end){
            temp[ind]= arr[right];
            right++;
            ind++;
        }
        for(int i = 0 ; i < temp.length;i++){
            arr[start + i] = temp[i];
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }
        mergeSortt(arr , 0 , arr.length -1);
        sc.close();
    }
}
