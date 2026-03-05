class Solution {
    public int countSubstrings(String s) {
        //same as the longest palindrome substring but instead returning a long substring we count all substrings
        int count = 0;
        for(int i =0;i<s.length();i++) {
            //update count
            count+= expand(s,i,i);//odd string
            count+= expand(s,i,i+1);//even string
        }
        return count;
    }
    public int expand(String s,int start,int end) {
        int count =0;
        while(start>=0 && end<s.length() && s.charAt(start) == s.charAt(end)) {
            count++;
            start--;
            end++;
        }
        return count;
    }
}