class Solution {
    public int reverse(int x) {
        long reverse = 0L;
        
        while(x != 0) {
            reverse = reverse * 10 + x % 10;
            x /= 10;
        } 
        
        return (reverse > Integer.MAX_VALUE || reverse < Integer.MIN_VALUE) ? 0 : (int) reverse;
        
    }
}
