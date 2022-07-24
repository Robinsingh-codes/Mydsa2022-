/*
Given a number and its reverse. Find that number raised to the power of its own reverse.
Note: As answers can be very large, print the result modulo 109 + 7.

Example 1:

Input:
N = 2
Output: 4
Explanation: The reverse of 2 is 2
and after raising power of 2 by 2 
we get 4 which gives remainder as 
4 by dividing 1000000007
*/


class Solution
{
        
     long power(int N,int R)
    {
        //Your code here
           if(R ==0) return 1;
       long temp = power(N, R/2)%1000000007;
       long sq = (temp*temp)%1000000007;
       if(R%2==0) return sq;
       return (N * sq)%1000000007;
       }
}

public static long reversenum(int N){
          rev_num = 0;
         while(n > 0) 
          { 
            rev_num = rev_num*10 + n%10; 
            n = n/10; 
          } 
  return rev_num';
   
    }
            // reverse the given number n
		    R=(int)reversenum(N);
	
            //power of the number to it's reverse
		    long ans=(long)obj.power(N,R);
