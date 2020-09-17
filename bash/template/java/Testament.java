
package $(padded_ordinal)_$(snaked_problem);

import org.junit.Test;
import org.junit.Assert;

public class Testament {

    private Solution solution = new Solution ();

    @Test void
    solution_works () {
        ${boxing} expected = new ${boxing} ();
        ${boxing} actual   = solution.${method} (...);
        Assert.assertEquals (expected, actual);
    }

}
