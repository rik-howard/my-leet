package a0022_generate_parentheses;

import java.util.ArrayList;
import java.util.List;

class Solution {

    List <String> generateParenthesis (int n) {  // sic
        return solution (n);
    }

    private List <String> solution (Integer n) {
        if (n <= 0) throw new IllegalArgumentException ("input too small");
        return generatedParentheses (n, n, "");
    }

    private List <String> generatedParentheses (int o, int c, String s) {
        if (c == 0) {
            List <String> list = new ArrayList <> ();
            list.add (s);
            return list;
        } else if (o > 0 && c > o) {
            List <String> fst = generatedParentheses (o - 1, c, s + "(");
            List <String> snd = generatedParentheses (o, c - 1, s + ")");
            fst.addAll (snd);
            return fst;
        } else if (o > 0) {
            return generatedParentheses (o - 1, c, s + "(");
        } else if (c > 0) {
            return generatedParentheses (o, c - 1, s + ")");
        } else throw new RuntimeException ("WTF");
    }

}
