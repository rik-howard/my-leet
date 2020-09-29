package a0020_valid_parentheses;

import java.util.Stack;

class Solution {

    boolean isValid (String s) {
        return solution (s);
    }

    private boolean solution (String string) {
        if (string == null) throw new IllegalArgumentException ("string is null");
        else if (string.length () < 1) throw new IllegalArgumentException ("string is empty");
        else if (string.length () > 10000) throw new IllegalArgumentException ("string is longer than 10 000 characters");
        else if (! string.matches ("^[(){}\\[\\]]+$")) throw new IllegalArgumentException ("string has invalid characters");
        else return validation (string, new Stack <> ());
    }

    private boolean validation (String string, Stack <Character> characters) {
        if (string.equals ("")) return characters.empty ();
        else {
            Character head = string.charAt (0);
            String tail = string.substring (1);
            return validation (head, tail, characters);
        }
    }

    private boolean validation (Character head, String tail, Stack <Character> characters) {
        String openers = "({[";
        String closers = ")}]";
        if (openers.contains (head.toString ())) return pushing (head, tail, characters);
        else if (closers.contains (head.toString ())) return popping (head, tail, characters);
        else throw new IllegalStateException ("never");
    }

    private boolean pushing (Character opener, String string, Stack <Character> characters) {
        characters.push (opener);
        return validation (string, characters);
    }

    private boolean popping (Character closer, String string, Stack <Character> characters) {
        if (characters.isEmpty ()) return false;
        else {
            Character opener = characters.pop ();
            return matching (opener, closer, string, characters);
        }
    }

    private boolean matching (Character opener, Character closer, String string, Stack <Character> characters) {
        String pairing = opener.toString () + closer.toString ();
        return switch (pairing) {
            case "()", "{}", "[]" -> validation (string, characters);
            default -> false;
        };
    }

}
