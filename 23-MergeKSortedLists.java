
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

import java.util.Arrays;

class Solution {
    public ListNode mergeKLists(ListNode[] lists) {

        if (lists.length == 0)
            return null;
        if (lists.length == 1)
            return lists[0];

        int mid = lists.length / 2;

        ListNode[] left = Arrays.copyOfRange(lists, 0, mid);
        ListNode[] right = Arrays.copyOfRange(lists, mid, lists.length);

        return mergeTwoLists(mergeKLists(left), mergeKLists(right));

    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null)
            return l2;
        if (l2 == null)
            return l1;

        ListNode head = null;

        if (l1.val < l2.val) {
            head = l1;
            head.next = mergeTwoLists(l1.next, l2);
        } else {
            head = l2;
            head.next = mergeTwoLists(l1, l2.next);
        }

        return head;
    }
}