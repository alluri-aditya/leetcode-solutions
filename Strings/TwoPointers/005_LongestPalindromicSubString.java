class Solution {
    public String longestPalindrome(String s) {
        //intially assume the string starting and ending
        int start = 0;
        int end = 0;
        for(int i =0;i<s.length();i++) {
            int len1 = expand(s,i,i);//left string mid is middle
            int len2 = expand(s,i,i+1);//for even string two mids
            int len = Math.max(len1,len2);
            //now we will update the string only if length is greater
            if(len>end-start) {
                start = i-(len-1)/2;
                end = i+len/2;
            }
        }
        //we will return the substring
        return s.substring(start,end+1);//since start to end-1 so we will write as end+1
    }
    public int expand(String s,int start,int end) {
        while(start>=0 && end<s.length() && s.charAt(start) == s.charAt(end)) {

            start--;
            end++;
        }
        return end-start-1;
    }
}