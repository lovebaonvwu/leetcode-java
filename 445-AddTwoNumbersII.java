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
        int[] carry = new int[3];
        ListNode cur = null;

        cur = l1;
        while (cur != null) {
            ++carry[0];
            cur = cur.next;
        }

        cur = l2;
        while (cur != null) {
            ++carry[1];
            cur = cur.next;
        }

        ListNode head = addTwoNumbers(l1, l2, carry);
        if (carry[2] > 0) {
            ListNode node = new ListNode(1);
            node.next = head;
            head = node;
        }

        return head;
    }

    private ListNode addTwoNumbers(ListNode l1, ListNode l2, int[] carry) {

        if (l1.next == null && l2.next == null) {
            carry[2] = (l1.val + l2.val) / 10;
            return new ListNode((l1.val + l2.val) % 10);
        }

        ListNode node = null;
        int sum = 0;

        if (carry[0] > carry[1]) {
            --carry[0];
            node = addTwoNumbers(l1.next, l2, carry);
            sum = l1.val + carry[2];
        } else if (carry[0] < carry[1]) {
            --carry[1];
            node = addTwoNumbers(l1, l2.next, carry);
            sum = l2.val + carry[2];
        } else {
            node = addTwoNumbers(l1.next, l2.next, carry);
            sum = l1.val + l2.val + carry[2];
        }

        carry[2] = sum / 10;
        ListNode head = new ListNode(sum % 10);
        head.next = node;
        return head;
    }
}

// class Solution {
//     public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//         Stack<Integer> s1 = new Stack();
//         Stack<Integer> s2 = new Stack();

//         while (l1 != null) {
//             s1.push(l1.val);
//             l1 = l1.next;
//         }

//         while (l2 != null) {
//             s2.push(l2.val);
//             l2 = l2.next;
//         }

//         int carry = 0;
//         ListNode head = new ListNode(0);

//         while (!s1.empty() || !s2.empty() || carry > 0) {
//             int val1 = s1.empty() ? 0 : s1.pop();
//             int val2 = s2.empty() ? 0 : s2.pop();
//             int sum = val1 + val2 + carry;

//             ListNode node = new ListNode(sum % 10);
//             node.next = head.next;
//             head.next = node;

//             carry = sum > 9 ? 1 : 0;
//         }

//         return head.next;
//     }
// }