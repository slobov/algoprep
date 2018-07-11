class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0 || x != 0 && x % 10 == 0) {
            return false;
        }
        
        if (x < 10) {
            return true;
        }
        
        
        long res = 0;
        // only half of x should be checked - i.e if x = 1221 only second two digits should be converted
        while (x > res) {
            res = res * 10 + x % 10;
            x /= 10;
        }
        
        // second part is for cases when number of x digits is odd (like 12421).
        // in this case res = 124 - so we need to divide it by 10 before comparing with x.
        return (x == res || x == res / 10);
    }
}
