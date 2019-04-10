/**
 * Definition for singly-linked list. 
 * public class ListNode { 
 *     int val; 
 *     ListNode next; 
 *     ListNode(int x) { val = x; } 
 * }
 */

 class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode oneStep = head;
        ListNode twoSteps = head;

        while (twoSteps != null && twoSteps.next != null) {
            oneStep = oneStep.next;
            twoSteps = twoSteps.next.next;
        }

        return oneStep;
    }
}

// class Solution {
//     public ListNode middleNode(ListNode head) {
//         int cnt = 0;

//         ListNode cur = head;

//         while (cur != null) {
//             ++cnt;
//             cur = cur.next;
//         }

//         for (int i = 0; i < cnt / 2; ++i) {
//             head = head.next;
//         }

//         return head;
//     }
// }