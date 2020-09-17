package a0007_reverse_integer;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Testament {

    private Solution solution = new Solution ();

    @Test void
    reverse_reverses_positive () {
        Integer original = 123;
        Integer expected = 321;
        Integer actual = solution.reverse (original);
        Assertions.assertEquals (expected, actual);
    }

    @Test void
    reverse_reverses_negative () {
        Integer original = -123;
        Integer expected = -321;
        Integer actual = solution.reverse (original);
        Assertions.assertEquals (expected, actual);
    }

    @Test void
    reverse_reverses_zero () {
        Integer original = 0;
        Integer expected = 0;
        Integer actual = solution.reverse (original);
        Assertions.assertEquals (expected, actual);
    }

    /*
     * java: integer number too large
     *//*
    @Test void
     reverse_falls_over () {
        Integer original = 2147483648;
        Integer expected = 1;
        Integer actual = solution.reverse (original);
        Assertions.assertEquals (expected, actual);
    }
     */

}
