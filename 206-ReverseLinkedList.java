/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */


// recursion
class Solution {
    public ListNode reverseList(ListNode head) {
        return reverseList(head, null);
    }

    private ListNode reverseList(ListNode head, ListNode prev) {
        if (head == null) {
            return prev;
        }

        ListNode temp = head.next;
        head.next = prev;

        return reverseList(temp, head);
    }
}

// iteration O(n)
// class Solution {
//     public ListNode reverseList(ListNode head) {
//         ListNode prev = null;
//         ListNode cur = head;

//         while (cur != null) {
//             ListNode temp = cur.next;
//             cur.next = prev;
//             prev = cur;
//             cur = temp;
//         }

//         return prev;
//     }
// }


// O(n * n)
//  class Solution {
//     public ListNode reverseList(ListNode head) {
//         if (head == null || head.next == null) {
//             return head;
//         }

//         ListNode node = reverseList(head.next);
//         ListNode cur = node;

//         while (cur.next != null) {
//             cur = cur.next;
//         }

//         cur.next = head;
//         head.next = null;

//         return node;
//     }
// }