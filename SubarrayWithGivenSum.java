/*
given an unsorted array A of size N that contains only non-negative integers,
find a continuous sub-array which adds to a given number S.

In case of multiple subarrays, return the subarray which comes first on moving from left to right.

Example 1:
Input:
N = 5, S = 12
A[] = {1,2,3,7,5}
Output: 2 4
Explanation: The sum of elements 
from 2nd position to 4th position 
is 12.

*/

static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
    {
        // Your code here
        ArrayList<Integer> a = new ArrayList<Integer>(n);
        
        for(int i=0;i<n;i++){
            int j=i+1;
            int sum=arr[i];
            
            while(j<n && sum<s){
                 sum=sum+arr[j];
                j++;
            }
            if(sum==s){
                a.add(i+1);
                a.add(j);
                return a;
            }
        }
        a.add(-1);
        return a;
    }
}
