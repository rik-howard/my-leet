
package a0007_reverse_integer;

class Solution {

    int reverse (int x) {
        return solution (x);
    }

    private Integer solution (Integer x) {
        String s = x < 0? "-" + reversedString (Math.abs (x)): reversedString (x);
        try {
            return Integer.valueOf (s);
        } catch (NumberFormatException e) {
            return 0;
        }
    }

    private String reversedString (int x) {
        return new StringBuilder (Integer.toString (x)).reverse ().toString ();
    }

}
