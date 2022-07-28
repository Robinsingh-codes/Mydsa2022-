
class GFG
{
    ArrayList<Long> find(long arr[], int n, int x)
    {
        Long first=(long)-1;
        Long last=(long)-1;
    
        for(int i=0;i<n;i++){
            if(x==arr[i]){
                if(first==-1)first=(long)i;
                
                last=(long)i;
            }
        }
        ArrayList<Long> res=new ArrayList<Long>(2);
        res.add(first);
        res.add(last);
        return res;
    }
}
