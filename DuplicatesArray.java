/*
Given an array a[] of size N which contains elements from 0 to N-1, you need to find all the elements occurring more than once in the given array.

Example 1:

Input:
N = 4
a[] = {0,3,1,2}
Output: -1
Explanation: N=4 and all elements from 0
to (N-1 = 3) are present in the given
array. Therefore output is -1.
*/
// duplicates in O(n) time
  
class Leet442 {
  
    public static void main(String args[])
    {
        int numRay[] = { 0, 4, 3, 2, 7, 8, 2, 3, 1 };
  
        for (int i = 0; i < numRay.length; i++) {
            numRay[numRay[i] % numRay.length]
                = numRay[numRay[i] % numRay.length]
                  + numRay.length;
        }
        System.out.println("The repeating elements are : ");
        for (int i = 0; i < numRay.length; i++) {
            if (numRay[i] >= numRay.length * 2) {
                System.out.println(i + " ");
            }
        }
    }
}


// using second array
class Solution {
    public static ArrayList<Integer> duplicates(int arr[], int n) {
          int ar[]= new int [n];
       int count =0;
       ArrayList<Integer> a = new ArrayList<>();
       for( int i=0;i<n;i++)
           ar[arr[i]]++;
       for(int i=0;i<n;i++)
       {
           if(ar[i]>1)
           {
               a.add(i);
               count++;
           }
       }
       if( count !=0) return a;
       else{
           a.add(-1);
           return a;
       } 
       
    }
}


// using two loops + arraylist methods(sort, add, reurn) +   N^2
class Solution {
    public static ArrayList<Integer> duplicates(int arr[], int n) {
        ArrayList<Integer> arrlist=new ArrayList<Integer>(n);
        for(int i =0; i<n;i++){
            
            for(int j=i+1;j<n;j++){
              if(arr[i]==arr[j]){
                  if(arrlist.contains(arr[j]))continue;
                  
                  arrlist.add(arr[j]);
                  
              }  
            }
        }
        if(arrlist.isEmpty()){
            arrlist.add(-1);
        }
        else{
            Collections.sort(arrlist);
        }
        
        return arrlist;
        
    }
}
