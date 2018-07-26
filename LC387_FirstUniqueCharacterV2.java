class Solution {
    public int firstUniqChar(String s) {
        Map<Character, CountIndex> syMap = new LinkedHashMap<>();
    
        for (int i = 0; i < s.length(); i++) {
            final int idx = i;
            syMap.compute(
                s.charAt(i), 
                (k, v) -> (v == null) ? new CountIndex(idx, 1) : v.increaseCount());
        }

        for (Map.Entry<Character, CountIndex> entry : syMap.entrySet()) {
            if (entry.getValue().count == 1) {
                return entry.getValue().index;
            }
        }
        
        return -1;
    }
}

class CountIndex {
    int index, count;
    
    CountIndex(int index, int count) {
        this.count = count;
        this.index = index;
    }
    
    CountIndex increaseCount() {
        return new CountIndex(this.index, this.count + 1);
    }  
}
