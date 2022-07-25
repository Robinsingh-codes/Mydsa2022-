class Solution {
    ArrayList<Integer> valueEqualToIndex(int arr[], int n) {
        ArrayList<Integer> ans=new ArrayList<Integer>(n);
        for(int i=0;i<n;i++){
            if(i+1==arr[i])ans.add(arr[i]);
        }
        System.out.print(ans);
        return ans;
    }
}
