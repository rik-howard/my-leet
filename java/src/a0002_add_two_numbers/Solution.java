package a0002_add_two_numbers;

class Solution {

    ListNode addTwoNumbers (ListNode l1, ListNode l2) {
        return solution (l1, l2);
    }

    private ListNode solution (ListNode l1, ListNode l2) {
        return addTwoNumbers (l1, l2, 0);
    }

    private ListNode addTwoNumbers (ListNode l1, ListNode l2, Integer carried) {
        if (l1 == null && l2 == null && carried == 0) return null;
        int sum = sum (l1, l2, carried);
        int newVal = sum % 10;
        int newCar = sum / 10;
        ListNode result = new ListNode (newVal);
        result.next =  next (l1, l2, newCar);
        return result;
    }

    private Integer sum (ListNode l1, ListNode l2, Integer carried) {
        if (l1 == null && l2 == null) return carried;
        else if (l1 == null) return l2.val + carried;
        else if (l2 == null) return l1.val + carried;
        else return l1.val + l2.val + carried;
    }

    private ListNode next (ListNode l1, ListNode l2, Integer carried) {
        if (l1 == null && l2 == null) return addTwoNumbers (null, null, carried);
        else if (l1 == null) return addTwoNumbers (null, l2.next, carried);
        else if (l2 == null) return addTwoNumbers (l1.next, null, carried);
        else return addTwoNumbers (l1.next, l2.next, carried);
    }

}
