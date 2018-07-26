class Solution {
    public int firstUniqChar(String s) {
        Map<Character, Integer> syMap = new HashMap<>(s.length());
    
        for (Character ch : s.toCharArray()) {
            syMap.compute(ch, (k, v) -> (v == null) ? 1 : v + 1);
        }
        
        for (int i = 0; i < s.length(); i++) {
            if (syMap.get(s.charAt(i)) == 1) {
                return i;
            }
        }

        return -1;
    }
}
