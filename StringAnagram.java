class Solution {
    public boolean isAnagram(String s, String t) {
        var fs = new int[26]; 
        var ft = new int[26];
        for(var c: s.toCharArray()){
            fs[c-'a']++;         }
        for(var c: t.toCharArray()){ 
            ft[c-'a']++;
        }
        for(int i = 0; i < 26; i++){ 
            if(fs[i] != ft[i])
                return false;
        }
        return true;
        
    }
}
******************************************
class Solution {
    public boolean isAnagram(String s, String t) {
        char []arr = s.toCharArray();
        char []tar=t.toCharArray();
        Arrays.sort(arr);
        Arrays.sort(tar);
        if(s.length()!=t.length())return false;
        for(int i=0;i<s.length();i++){
            if(arr[i]!=tar[i])return false;
        }
        return true;
    }
}
