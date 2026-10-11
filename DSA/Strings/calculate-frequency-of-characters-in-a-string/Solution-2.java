import java.util.Map;
import java.util.TreeMap;

class Solution {
    public String characterFrequency(String s) {
        // TreeMap keeps the keys (characters) sorted automatically in ascending order
        Map<Character, Integer> mp = new TreeMap<>();
        
        // Count frequencies of each character
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            mp.put(ch, mp.getOrDefault(ch, 0) + 1);
        }
        
        StringBuilder sb = new StringBuilder();
        
        // Iterate through the sorted map entries
        for (Map.Entry<Character, Integer> entry : mp.entrySet()) {
            if (sb.length() > 0) {
                sb.append(" ");
            }
            sb.append(entry.getKey()).append(entry.getValue());
        }
        
        return sb.toString();
    }
}