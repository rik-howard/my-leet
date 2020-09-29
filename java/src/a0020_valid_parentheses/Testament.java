package a0020_valid_parentheses;

import org.junit.Test;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

@SuppressWarnings ("WrapperTypeMayBePrimitive")
public class Testament {

    private final Solution solution = new Solution ();

    @Test public void
    example_1 () {
        String string = "()";
        Boolean actual = solution.isValid (string);
        assertTrue (actual);
    }

    @Test public void
    example_2 () {
        String string = "()[]{}";
        Boolean actual = solution.isValid (string);
        assertTrue (actual);
    }

    @Test public void
    example_3 () {
        String string = "(]";
        Boolean actual = solution.isValid (string);
        assertFalse (actual);
    }

    @Test public void
    example_4 () {
        String string = "([)]";
        Boolean actual = solution.isValid (string);
        assertFalse (actual);
    }

    @Test public void
    example_5 () {
        String string = "{[]}";
        Boolean actual = solution.isValid (string);
        assertTrue (actual);
    }

}
