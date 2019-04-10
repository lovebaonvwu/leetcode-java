/**
 * Definition for singly-linked list. 
 * public class ListNode { 
 *     int val; 
 *     ListNode next; 
 *     ListNode(int x) { val = x; } 
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<Integer> s1 = new Stack();
        Stack<Integer> s2 = new Stack();

        while (l1 != null) {
            s1.push(l1.val);
            l1 = l1.next;
        }

        while (l2 != null) {
            s2.push(l2.val);
            l2 = l2.next;
        }

        int carry = 0;
        ListNode head = new ListNode(0);

        while (!s1.empty() || !s2.empty() || carry > 0) {
            int val1 = s1.empty() ? 0 : s1.pop();
            int val2 = s2.empty() ? 0 : s2.pop();
            int sum = val1 + val2 + carry;

            ListNode node = new ListNode(sum % 10);
            node.next = head.next;
            head.next = node;

            carry = sum > 9 ? 1 : 0;
        }

        return head.next;
    }
}