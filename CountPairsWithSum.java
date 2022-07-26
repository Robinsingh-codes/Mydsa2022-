class Solution {
    int getPairsCount(int[] arr, int n, int k) {
        // code here
        int sum=0;
        int count=0;
        for(int i=0;i<n;i++){
            sum=arr[i];
            int j=i+1;
            while(j<n){
                
                if(sum+arr[j]==k){
                    count++;
                }
                j++;
            }
    
        }
        return count;
        
    }
}
