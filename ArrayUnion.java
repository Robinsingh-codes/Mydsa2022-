class Solution{
    public static int doUnion(int a[], int n, int b[], int m) 
    {
       HashSet<Integer> hs=new HashSet<Integer>();
       for(int i=0;i<n;i++){
       hs.add(a[i]);
       }
      for(int i=0; i<m;i++){
          hs.add(b[i]);
          }
          
      return hs.size();
    }
}
