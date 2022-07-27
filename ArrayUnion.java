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
***********************************
class Solution
{
    //Function to return a list containing the union of the two arrays.
    public static ArrayList<Integer> findUnion(int arr1[], int arr2[], int n, int m)
    {
        HashSet<Integer> hs = new HashSet<Integer>();
        
        for(int i=0;i<n;i++)hs.add(arr1[i]);
        for(int j=0;j<m;j++)hs.add(arr2[j]);
        
        ArrayList<Integer> al=new ArrayList<>();
        //  al.addAll(hs);
        for(int ob:hs){
            al.add(ob);
        }
        
        
        Collections.sort(al);
        return al;
    }
}

