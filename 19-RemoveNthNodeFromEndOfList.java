/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode cur = head;

        int cnt = 0;
        while (cur != null) {
            ++cnt;
            cur = cur.next;
        }

        cur = head;
        ListNode prev = null;
        for (int i = 0; i < cnt - n; ++i) {
            prev = cur;
            cur = cur.next;
        }

        if (prev == null) {
            return head.next;
        }

        prev.next = cur.next;

        return head;
    }
}