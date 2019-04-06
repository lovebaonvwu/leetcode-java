
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode oddEvenList(ListNode head) {
        
        if (head == null) return head;
        
        ListNode cur = head;
        ListNode evenHead = cur.next;
        ListNode evenCur = evenHead;
        
        while (cur.next != null && cur.next.next != null) {
            cur.next = cur.next.next;
            cur = cur.next;
            evenCur.next = cur.next;
            evenCur = evenCur.next;
        }
        
        cur.next = evenHead;
        
        return head;
    }
}