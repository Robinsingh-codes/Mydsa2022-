/*
Minimize the Heights I
Given an array arr[] denoting heights of N towers and a positive integer K, 
you have to modify the height of each tower either by increasing or decreasing them by K only once.
Find out what could be the possible minimum difference of the height of shortest and longest towers after you have modified each tower.
Note: Assume that height of the tower can be negative.
A slight modification of the problem can be found here. 


Example 1:

Input:
K = 2, N = 4
Arr[] = {1, 5, 8, 10}
Output:
5
Explanation:
The array can be modified as 
{3, 3, 6, 8}. The difference between 
the largest and the smallest is 8-3 = 5.
Example 2:

Input:
K = 3, N = 5
Arr[] = {3, 9, 12, 16, 20}
Output:
11
*/
class Solution {
    int getMinDiff(int[] arr, int n, int k) {
        // code here
        Arrays.sort(arr);
     int high=arr[n-1];
     int low=arr[0];
     int res=high-low;
     
     for(int i=1;i<n;i++){
         high=Math.max(arr[i-1]+k,arr[n-1]-k);
         low=Math.min(arr[i]-k,arr[0]+k);
         res=Math.min(res,high-low);
         
     }
     return res;
    }
}
