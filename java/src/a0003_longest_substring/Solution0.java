package a0003_longest_substring;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

class Solution0
implements Solution {

    @Override public int lengthOfLongestSubstring (String s) {
        return solution (s);
    }

    private Integer solution (String s) {
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            StringBuilder t = new StringBuilder();
            for (int j = i; j < s.length(); j++) {
                String c = s.substring(j, j + 1);
                if (t.toString().contains(c)) break;
                else t.append(c);
            }
            map.put(t.toString(), t.toString().length());
        }
        return map.isEmpty()? 0: Collections.max(map.values());
    }

    /**
     * This is my brute force algorithm.
     * 1. From the beginning of `s`, append each character to a temporary string
     *    until a duplicate character is found.
     * 2. Store the temporary string and its length in the map.
     * 3. Repeat steps 1 and 2 from the second and then subsequent characters of `s`.
     * 4. Return the maximum length from the map.
     * Time complexity: O(n²)
     * Space complexity: O(n²)
     */

}
