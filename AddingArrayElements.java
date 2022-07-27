/* Given an array Arr[] of size N and an integer K,
you have to add the first two minimum elements of the array 
until all the elements are greater than or equal to K
and find the number of such operations required.

Example 1:

Input:
N = 6, K = 6 
Arr[] = {1, 10, 12, 9, 2, 3}
Output: 2
Explanation: First we add (1 + 2), now the
new list becomes 3 10 12 9 3, then we add
(3 + 3), now the new list becomes 6 10 12 9,
Now all the elements in the list are greater
than 6. Hence the output is 2 i:e 2 operations
are required to do this. 
*/

******************************************************
//naive approACHB TLE 
int minOperations(int[] arr, int n, int k) {
        // code here
        int count=0;
        int i=0;
        Arrays.sort(arr);
        while(arr[0]<k){
            arr[0]=arr[0]+arr[1];
            arr[1]=Integer.MAX_VALUE;
            count++;
            Arrays.sort(arr);
           // System.out.println(Arrays.toString(arr));
        }
        return count;
        
        ********************************************
        // prority queue O NLOGN 
        class Solution {
    int minOperations(int[] arr, int n, int k) {
        // code here
        
         PriorityQueue<Integer> q = new PriorityQueue<>();
    for(int i=0;i<n;i++)
        q.add(arr[i]);
    int count = 0;
    while(q.size() > 1)
    {
        int n1 = q.remove();
        int n2 = q.remove();
        if(n1 >= k) break;
        q.add(n1+n2);
        count++;
    }
    return count;
    }
}
