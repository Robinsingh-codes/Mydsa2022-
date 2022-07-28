class Solution{
    //Function to check whether there is a subarray present with 0-sum or not.
    static boolean findsum(int arr[],int n)
    {
        int sum=0;
        for(int i=0;i<n;i++){
            sum=arr[i];
            int j=i+1;
            while(sum!=0 && j<n){
                sum+=arr[j];
                j++;
            }
            if(sum==0)return true;
        }
        return false;
        
    }
}
********************************************************
 HashSet<Integer> s=new HashSet<>();
       s.add(0);
       int sum=0;
       for(int i:arr){
           sum+=i;
           if(s.contains(sum))return true;
           else s.add(sum);
       }
       return false;
*******************************************************
