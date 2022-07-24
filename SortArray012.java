/*
Given an array of size N containing only 0s, 1s, and 2s; sort the array in ascending order.


Example 1:

Input: 
N = 5
arr[]= {0 2 1 2 0}
Output:
0 0 1 2 2
*/
// USING SWITCH CASE AND THREE POINTERS       
//O(N)---TIME COMPLEXITY + O(1)-- SPACE COMPLEXITY
class Solution
{
    public static void sort012(int a[], int n)
    {
        // code here
        int l=0;
        int hi=n-1;
        int m=0;
        int temp;
        while(m<=hi){
            switch(a[m]){
                case 0:{
                    temp=a[l];
                    a[l]=a[m];
                    a[m]=temp;
                    l++;
                    m++;
                    break;
                }
                case 1:{
                    m++;
                    break;
                }
                case 2:{
                    temp=a[m];
                    a[m]=a[hi];
                    a[hi]=temp;
                    hi--;
                    break;
                }
            }
        }
        
    }
}
