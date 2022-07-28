
//           O(N3)

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res=new LinkedList<>();
        int n =nums.length;
        Arrays.sort(nums);
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                for(int k=j+1;k<n;k++){
                    if(nums[i]+nums[j]+nums[k]==0){
                        res.add(Arrays.asList(nums[i],nums[j],nums[k]));
                        
                    }
                }
            }
        }
        return res;
    }
}
*************************************
//              O(N2+NLOGN)

    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res=new LinkedList<>();
        int n =nums.length;
        Arrays.sort(nums);
        int l=1, h=n-1;
        
        for(int i=0;i<n;i++){

            if(i==0 || (l>0 && nums[i]!=nums[i-1]) ){
                 l=i+1;
                h=n-1;
                int sum=0-nums[i];
                
                while(l<h){
                    if(nums[l]+nums[h]==sum){
                        res.add(Arrays.asList(nums[i],nums[l],nums[h]));
                        while(l<h && nums[l]==nums[l+1])l++;
                while(l<h && nums[h]==nums[h-1])h--;
                    
                    l++;
                    h--;
                    }
                
                      
                
                 else if( nums[l]+nums[h]<sum)l++;
                 else h--;
                
                } 
            }
        
        }
        
        return res;
    }
