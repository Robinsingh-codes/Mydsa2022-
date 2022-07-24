/*

Given a sorted array of size N and an integer K, 
find the position at which K is present in the array using binary search.

Example 1:

Input:
N = 5
arr[] = {1 2 3 4 5} 
K = 4
Output: 3

*/



class Solution {
    int binarysearch(int arr[], int n, int k) {
        // code here
        
        int s=0, e=n-1;
        int mid=s+(e-s)/2;
        int result=-1;
        while(s<=e){
            if(arr[mid]==k){
                return mid;
            }
            
            else if(arr[mid]>k){
                e=mid-1;
            }
            else{
                s=mid+1;
            }
            mid=s+(e-s)/2;
        }
         return result;
    }
}
