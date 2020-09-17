package a0001_two_sum;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Testament {

    private Solution solution = new Solution ();

    @Test void
    twoSum_supports_example_1 () {
        int originalTarget = 9;
        int [] originalNums = new int [] {2, 7, 11, 15};
        int [] expected = new int [] {0, 1};
        int [] actual = solution.twoSum (originalNums, originalTarget);
        Assertions.assertArrayEquals (expected, actual);
    }

    @Test void
    twoSum_supports_example_2 () {
        int originalTarget = 6;
        int [] originalNums = new int [] {3, 2, 4};
        int [] expected = new int [] {1, 2};
        int [] actual = solution.twoSum (originalNums, originalTarget);
        Assertions.assertArrayEquals (expected, actual);
    }

    @Test void
    twoSum_supports_example_3 () {
        int originalTarget = 6;
        int [] originalNums = new int [] {3, 3};
        int [] expected = new int [] {0, 1};
        int [] actual = solution.twoSum (originalNums, originalTarget);
        Assertions.assertArrayEquals (expected, actual);
    }

}
