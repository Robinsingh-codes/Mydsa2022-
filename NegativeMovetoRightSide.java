/*
Given an unsorted array arr[] of size N having both negative and positive integers. 
The task is place all negative element at the end of array without changing the order of positive element and negative element.

Example 1:

Input : 
N = 8
arr[] = {1, -1, 3, 2, -7, -5, 11, 6 }
Output : 
1  3  2  11  6  -1  -7  -5

*/
// using another array
class Solution {
    
    public void segregateElements(int arr[], int n)
    {   
        int[] b=new int[n+1];
        int s=0,l=n-1;
        for(int i=0;i<n;i++){
            if(arr[i]>0){
                b[s]=arr[i];
                s++;
            }
        }
        for(int i=n-1;i>=0;i--){
            if(arr[i]<0){
                b[l]=arr[i];
                l--;
            }
        }
        
         for(int i=0;i<n;i++){
             arr[i]=b[i];
         }
    }
}

// using sorting then reversing NLOGN 

class Solution {
    
    public void segregateElements(int arr[], int n)
    {
        Arrays.sort(arr);
        reverse(arr,arr.length);
    }
    public void reverse(int arr[],int n){
        int start=0,end=n-1;
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            
            start++;
            end--;
        }
    }
}
