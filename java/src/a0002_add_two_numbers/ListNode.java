package a0002_add_two_numbers;

import java.util.Objects;

class ListNode {

    int val;
    ListNode next;
    ListNode () {}
    ListNode (int val) {this.val = val;}
    ListNode (int val, ListNode next) {this.val = val; this.next = next;}

    @Override public boolean equals (Object object) {
        if (this == object) return true;
        else if (null == object) return false;
        else if (getClass ().equals (object.getClass ())) {
            ListNode that = (ListNode) object;
            return Objects.equals (this.val, that.val)
                && Objects.equals (this.next, that.next);
        }
        else return false;
    }

    @Override public int hashCode () {
        return Objects.hash (val, next);
    }

    @Override public String toString () {
        String template = "ListNode{val:%s;next:%s}";
        return String.format (template, val, next);
    }

}
