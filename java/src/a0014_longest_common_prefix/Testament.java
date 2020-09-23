package a0014_longest_common_prefix;

import org.junit.Test;
import org.junit.Assert;

public class Testament {

    private Solution solution = new Solution ();

    @Test public void
    exercise_1 () {
        String [] original = new String [] {"flower", "flow", "flight"};
        String expected = "fl";
        String actual   = solution.longestCommonPrefix (original);
        Assert.assertEquals (expected, actual);
    }

    @Test public void
    exercise_2 () {
        String [] original = new String [] {"dog", "racing", "car"};
        String expected = "";
        String actual   = solution.longestCommonPrefix (original);
        Assert.assertEquals (expected, actual);
    }

    @Test public void
    edge_0 () {
        String [] original = new String [] {};
        String expected = "";
        String actual   = solution.longestCommonPrefix (original);
        Assert.assertEquals (expected, actual);
    }

    @Test public void
    edge_1 () {
        String [] original = new String [] {"foo", ""};
        String expected = "";
        String actual   = solution.longestCommonPrefix (original);
        Assert.assertEquals (expected, actual);
    }

}
