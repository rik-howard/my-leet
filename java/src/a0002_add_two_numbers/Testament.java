package a0002_add_two_numbers;

import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Testament {

    private Solution solution = new Solution ();

    @Test void
    addTwoNumbers_supports_example () {
        ListNode l1 = listNode (2, 4, 3);
        ListNode l2 = listNode (5, 6, 4);
        ListNode expected = listNode (7, 0, 8);
        ListNode actual = solution.addTwoNumbers (l1, l2);
        Assertions.assertEquals (expected, actual);
    }

    @Test void
    addTwoNumbers_supports_zero_list () {
        ListNode l1 = listNode ();
        ListNode l2 = listNode ();
        ListNode expected = listNode ();
        ListNode actual = solution.addTwoNumbers (l1, l2);
        Assertions.assertEquals (expected, actual);
    }

    @Test void
    addTwoNumbers_supports_one_list () {
        ListNode l1 = listNode ();
        ListNode l2 = listNode (0);
        ListNode expected = listNode (0);
        ListNode actual = solution.addTwoNumbers (l1, l2);
        Assertions.assertEquals (expected, actual);
    }

    @Test void
    addTwoNumbers_supports_two_list () {
        ListNode l1 = listNode ();
        ListNode l2 = listNode (1, 2);
        ListNode expected = listNode (1, 2);
        ListNode actual = solution.addTwoNumbers (l1, l2);
        Assertions.assertEquals (expected, actual);
    }

    @Test void
    addTwoNumbers_supports_additional_0 () {
        ListNode l1 = listNode (2, 4, 3, 1);
        ListNode l2 = listNode (5, 6, 4);
        ListNode expected = listNode (7, 0, 8, 1);
        ListNode actual = solution.addTwoNumbers (l1, l2);
        Assertions.assertEquals (expected, actual);
    }

    @Test void
    addTwoNumbers_supports_additional_1 () {
        ListNode l1 = listNode (2, 4, 3);
        ListNode l2 = listNode (5, 6, 4, 1);
        ListNode expected = listNode (7, 0, 8, 1);
        ListNode actual = solution.addTwoNumbers (l1, l2);
        Assertions.assertEquals (expected, actual);
    }

    private ListNode listNode (Integer ... integers) {
        Integer integersLength = integers.length;
        return integersLength == 0?
            new ListNode ():
            new ListNode (
                integers [0],
                listNode (Arrays.copyOfRange (integers, 1, integersLength))
            );
    }

}
