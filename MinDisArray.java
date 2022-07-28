*********************             O(N)
 int minDist(int a[], int n, int x, int y) {
     int minDis = n;
       int start = -1;
       int end = -1;
       for(int i = 0 ; i < n ; i++){
           if(a[i] == x){
               start = i;
           }
           if(a[i] == y){
               end = i;
           }
           if(start != -1 && end != -1){
               minDis = Math.min(minDis,Math.abs(end-start));
           }
       }
       if(start == -1 || end == -1){
           return -1;
       }
       return minDis;
