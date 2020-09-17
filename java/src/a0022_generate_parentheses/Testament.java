package a0022_generate_parentheses;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Testament {

    private Solution solution = new Solution ();

    @Test void
    generateParenthesis_generates_for_1 () {
        List <String> expected = Collections.singletonList ("()");
        List <String> actual = solution.generateParenthesis (1);
        Assertions.assertEquals (expected, actual);
    }

    @Test void
    generateParenthesis_generates_for_2 () {
        List <String> expected = Arrays.asList ("(())", "()()");
        List <String> actual = solution.generateParenthesis (2);
        Assertions.assertEquals (expected, actual);
    }

    @Test void
    generateParenthesis_generates_for_3 () {
        List <String> expected = Arrays.asList ("((()))", "(()())", "(())()", "()(())", "()()()");
        List <String> actual = solution.generateParenthesis (3);
        Assertions.assertEquals (expected, actual);
    }

    @Test void
    generateParenthesis_generates_for_4 () {
        List <String> expected = Arrays.asList ("(((())))", "((()()))", "((())())", "((()))()", "(()(()))", "(()()())", "(()())()", "(())(())", "(())()()", "()((()))", "()(()())", "()(())()", "()()(())", "()()()()");
        List <String> actual = solution.generateParenthesis (4);
        Assertions.assertEquals (expected, actual);
    }

}
