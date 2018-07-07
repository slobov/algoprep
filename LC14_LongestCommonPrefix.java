class Solution {
    private static final String EMPTY_PREFIX = "";
    
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return EMPTY_PREFIX;
        }
        
        Arrays.sort(strs);
        
        char[] firstStringChars = strs[0].toCharArray();
        char[] lastStringChars = strs[strs.length - 1].toCharArray();
        StringBuilder prefixBuilder = new StringBuilder();
        for (int i = 0; i < firstStringChars.length && i < lastStringChars.length; i++) {
            if (firstStringChars[i] == lastStringChars[i]) {
                prefixBuilder.append(firstStringChars[i]);
            } else {
                return prefixBuilder.toString();
            }
        }
        
        return prefixBuilder.toString();
        
     }
}
