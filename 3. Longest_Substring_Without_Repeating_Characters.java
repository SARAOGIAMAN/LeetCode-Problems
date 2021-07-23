class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i=0,j=i+3;
        int res=0;
        while(j<s.length-2)
        {
            String st=s.substring(i,j);
           if(st.charAt(0)!=st.charAt(1)&&st.charAt(1)!=st.charAt(2)&&st.charAt(0)!=st.charAt(3))
           {
               int res+=1;
           }
        }
        return res;
    }
}
