/*
Given a Binary Tree, find the maximum sum path from a leaf to root.
Example 1:
Input:
        1
       / \
      2   3 
Output:
4
*/
class Solution
{
    public static int maxPathSum(Node root)
    {
        //code here
          if( root == null){
           return 0;
       }
        int left = maxPathSum(root.left);
        int right = maxPathSum(root.right);
        int s = Math.max(left,right);
       return s+root.data;
    }
}
