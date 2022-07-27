/*
iven two arrays a[] and b[] respectively of size n and m, 
the task is to print the count of elements in the intersection (or common elements) of the two arrays.
the intersection of two arrays can be defined as the set containing distinct common elements between the two arrays. 

Example 1:

Input:
n = 5, m = 3
a[] = {89, 24, 75, 11, 23}
b[] = {89, 2, 4}

Output: 1
*/


public static int NumberofElementsInIntersection(int a[], int b[], int n, int m) {
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(a[i]==b[j]){
                    count++;
                    b[j]=Integer.MAX_VALUE;
                    
                    
                }
            }
        }
        return count;
    }
    ***********************************
     public static int NumberofElementsInIntersection(int a[], int b[], int n, int m) {
        int count=0;
        Arrays.sort(a);
        Arrays.sort(b);
        int i=0,j=0;
        while(i<n && j<m){
            if(a[i]==b[j]){
                count++;
                i++;
                j++;
                
            }
            else if(a[i]<b[j]){
                i++;
            }
            else {j++;
            }
        }
        
        
        return count;
    }
    *************************
     public static int NumberofElementsInIntersection(int a[], int b[], int n, int m) {
        HashSet<Integer> hs = new HashSet<Integer>();
        
        for(int i=0;i<n;i++)
        hs.add(a[i]);
        
        int res=0;
        for(int j=0;j<m;j++){
            if(hs.contains(b[j])){
                res++;
                hs.remove(b[j]);
            }
        }
        return res;
        
    }
