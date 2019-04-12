/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

 class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode prev = null;
        ListNode slow = head;
        ListNode fast = head;

        if (head == null || head.next == null)
            return true;

        ListNode next;
        while (fast != null && fast.next != null) {
            // find middle
            fast = fast.next.next;

            // reverse list
            next = slow.next;
            slow.next = prev;
            prev = slow;
            slow = next;

        }

        fast = fast == null ? slow : slow.next;
        slow = prev;

        while (fast != null) {
            if (fast.val != slow.val)
                return false;
            fast = fast.next;
            slow = slow.next;
        }

        return true;
    }
}

//Time: O(n), Space: O(1)
// class Solution {
//     public boolean isPalindrome(ListNode head) {
//         ListNode prev = null;
//         ListNode slow = head;
//         ListNode fast = head;

//         if (head == null || head.next == null)
//             return true;

//         while (fast != null && fast.next != null) {
//             fast = fast.next.next;
//             prev = slow;
//             slow = slow.next;
//         }

//         prev.next = null;

//         slow = reverseList(slow);

//         while (slow != null && head != null) {
//             if (slow.val != head.val)
//                 return false;
//             slow = slow.next;
//             head = head.next;
//         }

//         return true;
//     }

//     private ListNode reverseList(ListNode head) {
//         ListNode prev = null;
//         ListNode cur = head;

//         while (cur != null) {
//             ListNode next = cur.next;
//             cur.next = prev;
//             prev = cur;
//             cur = next;
//         }

//         return prev;
//     }
// }