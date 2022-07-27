/*
Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.

Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000
Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. 
Instead, the number four is written as IV. Because the one is before the five we subtract it making four. 
The same principle applies to the number nine, which is written as IX.
There are six instances where subtraction is used:

I can be placed before V (5) and X (10) to make 4 and 9. 
X can be placed before L (50) and C (100) to make 40 and 90. 
C can be placed before D (500) and M (1000) to make 400 and 900.
Given a roman numeral, convert it to an integer.

Example 1:

Input: s = "III"
Output: 3
Explanation: III = 3.


*/




class Solution {
    public int romanToInt(String s) {
        int res=0;
        for(int i=0;i< s.length();i++){
            switch(s.charAt(i)){
                case 'M': {
                    if (i > 0 && s.charAt(i - 1) == 'C') res += 800;
                    else res += 1000;
                    break;
                }
                case 'D': {
                    if (i > 0 && s.charAt(i - 1) == 'C') res += 300;
                    else res += 500;
                    break;
                }
                case 'C': {
                    if (i > 0 && s.charAt(i - 1) == 'X') res += 80;
                    else res += 100;
                    break;
                }
                case 'L': {
                    if (i > 0 && s.charAt(i - 1) == 'X') res += 30;
                    else res += 50;
                    break;
                }
                case 'X': {
                    if (i > 0 && s.charAt(i - 1) == 'I') res += 8;
                    else res += 10;
                    break;
                }
                case 'V': {
                    if (i > 0 && s.charAt(i - 1) == 'I') res += 3;
                    else res += 5;
                    break;
                }
                case 'I': {
                    res += 1;
                    break;
                }
                default:
                    return 0;
            }
        }
        return res;
            
                    
            }
        }
