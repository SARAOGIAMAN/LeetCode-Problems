class Solution {
    public boolean isPalindrome(int x) {
        int rev=0;
        int s=x;
        while(x>0)
        {
            rev=rev*10+(x%10);
            x/=10;
        }
        if(rev==s)
            return true;
        else
            return false;
    }
}
