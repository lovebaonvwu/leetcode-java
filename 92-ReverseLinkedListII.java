/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

class Solution {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        ListNode prev = null;
        ListNode tail = null;
        ListNode headOfSubList = head;
        ListNode tailOfSubList = head;
        ListNode temp = null;
        ListNode p = null;
        ListNode q = null;

        while (m > 1 || n > 1) {
            if (m > 1) {
                prev = headOfSubList;
                headOfSubList = headOfSubList.next;
                tailOfSubList = tailOfSubList.next;
                --m;
                --n;
            } else {
                tailOfSubList = tailOfSubList.next;
                --n;
            }
        }

        tail = tailOfSubList.next;
        tailOfSubList.next = null;

        q = headOfSubList;

        while (q != null) {

            temp = q.next;
            q.next = p;
            p = q;

            q = temp;
        }

        if (prev != null) {
            prev.next = p;
        } else {
            head = p;
        }

        headOfSubList.next = tail;

        return head;
    }
}