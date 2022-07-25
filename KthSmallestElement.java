  //FIND Kth smallest elemetn 
  
  
  public static int kthSmallest(int[] arr, int l, int r, int k) 
    { //l= first index, r= last index
        Arrays.sort(arr);
      //  System.out.print(Arrays.toString(arr));
        return arr[k-1];
    } 

2.USE QUICK SORT
