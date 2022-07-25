public static int palinArray(int[] a, int n)
          {
                 //add code here.
                for(int i=0;i<n;i++){
                    if(check(a[i])==false){
                        return 0;
                    }
                }
                return 1;
          }
          
          
          
       public static boolean check(int num){
       int reversed=0;
       int digitt=num;
        while(num != 0) {
           
             int digit = num % 10;
             reversed = reversed * 10 + digit;
       
             num /= 10;
           }
           
           if(reversed==digitt){
               return true;
           }
           return false;
       }
