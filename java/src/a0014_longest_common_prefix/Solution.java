package a0014_longest_common_prefix;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Solution {

    String longestCommonPrefix (String [] strs) {
        return solution (Arrays.asList (strs));
    }

    private String solution (List <String> strings) {
        StringBuilder builder = new StringBuilder ();
        String shortest = shortestString (strings);
        List <String> others = otherStrings (strings, shortest);
        while (shortest.length () > 0) {
            char initial = shortest.charAt (0);
            if (initialsEqual (initial, others)) builder.append (initial);
            else return builder.toString ();
            others = otherStrings (others);
            shortest = shortest.substring (1);
        }
        return builder.toString ();
    }

    private List <String> otherStrings (List <String> others) {
        return others
            .stream ()
            .map (string -> string.substring (1))
            .collect (Collectors.toList ())
        ;
    }

    private Boolean initialsEqual (char initial, List <String> others) {
        return others
            .stream ()
            .map (string -> string.charAt (0) == initial)
            .reduce (true, Boolean::logicalAnd)
        ;
    }

    private List <String> otherStrings (List <String> strings, String shortest) {
        return strings
            .stream ()
            .filter (string -> ! string.equals (shortest))
            .collect (Collectors.toList ())
        ;
    }

    private String shortestString (List <String> strings) {
        final String [] shortest = {strings.isEmpty ()? "": strings.get (0)};
        strings
            .forEach (string -> {
                if (string.length () < shortest [0].length ())
                    shortest [0] = string;
            });
        return shortest [0];
    }

}
