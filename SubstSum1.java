/*
Given an array nums of n integers. Return array of sum of all subsets of the array nums.
Output can be returned in any order.
Example 1
Input : nums = [2, 3]
Output : [0, 2, 3, 5]
Explanation :
When no elements is taken then Sum = 0.
When only 2 is taken then Sum = 2.
When only 3 is taken then Sum = 3.
When element 2 and 3 are taken then sum = 2+3 = 5.
Example 2
Input : nums = [5, 2, 1]
Output : [0, 1, 2, 3, 5, 6, 7, 8]
Explanation :
When no elements is taken then Sum = 0.
When only 5 is taken then Sum = 5.
When only 2 is taken then Sum = 2.
When only 1 is taken then Sum = 1.
When element 2 and 1 are taken then sum = 2+1 = 3.
*/

import java.util.ArrayList;
import java.util.Scanner;

class Solution{
    void fun(int ind , int sum , ArrayList<Integer> arr , int N , ArrayList<Integer> ans){
        if(ind == N){
            ans.add(sum);
            return;
        }
        fun(ind + 1, sum + arr.get(ind) , arr , N , ans);
        fun(ind + 1, sum, arr, N, ans);
    }
    public ArrayList<Integer> subsetSum(ArrayList<Integer> arr , int N){
        ArrayList<Integer> ans = new ArrayList<>();
        fun(0, 0, arr, N, ans);
        return ans;
    }
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        ArrayList<Integer> arr = new ArrayList<>();

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr.add(sc.nextInt());
        }

        Solution obj = new Solution();
        ArrayList<Integer> result = obj.subsetSum(arr, n);

        System.out.println("Subset sums are:");
        for (int x : result) {
            System.out.print(x + " ");
        }
        sc.close();
    }
}