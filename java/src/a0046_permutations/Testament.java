package a0046_permutations;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Testament {

    private Solution solution = new Solution ();

    @Test void
    permute_permutes_1_arrays () {
        List <List <Integer>> expected = Collections.singletonList (Collections.singletonList (1));
        List <List <Integer>> actual = solution.permute (new int[] {1});
        Assertions.assertEquals (expected, actual);
    }

    @Test void
    permute_permutes_2_arrays () {
        List <List <Integer>> expected = Arrays.asList (
            Arrays.asList (1, 2),
            Arrays.asList (2, 1)
        );
        List <List <Integer>> actual = solution.permute (new int[] {1, 2});
        Assertions.assertEquals (expected, actual);
    }

    @Test void
    permute_permutes_3_arrays () {
        List <List <Integer>> expected = Arrays.asList (
            Arrays.asList (1, 2, 3),
            Arrays.asList (1, 3, 2),
            Arrays.asList (2, 1, 3),
            Arrays.asList (2, 3, 1),
            Arrays.asList (3, 1, 2),
            Arrays.asList (3, 2, 1)
        );
        List <List <Integer>> actual = solution.permute (new int[] {1, 2, 3});
        Assertions.assertEquals (expected, actual);
    }

}
