package a0003_longest_substring;

import java.util.HashMap;
import java.util.Map;

class Solution1
implements Solution {

    /**
     * This is the one that I half-inched from the site.
     * Time complexity: O(n)
     * Space complexity: O(n)
     */
    @Override public int lengthOfLongestSubstring (String s) {
        if (s.isEmpty ()) return 0;
        Map <Character, Integer> map = new HashMap <> ();
        Integer max = 0;
        Integer j = 0;
        for (Integer i = 0; i < s.length (); i++) {
            Character c = s.charAt (i);
            if (map.containsKey (c))
                j = Math.max (j, map.get (c) + 1);
            map.put (c, i);
            max = Math.max (max, i - j + 1);
        }
        return max;
    }

}
