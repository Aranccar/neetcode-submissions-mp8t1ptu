/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dummy = new ListNode();
        dummy.next = head;
        ListNode cur = head;
        ListNode prev = dummy;
        
        for(int i = 0; i < left - 1; i++){
            prev = cur;
            cur = cur.next;
        }

        ListNode end = null;
        for(int j = 0; j < right - left + 1; j++){
            ListNode tmp = cur.next;
            cur.next = end;
            end = cur;
            cur = tmp;
        }

        prev.next.next = cur;
        prev.next = end;

        return dummy.next;

    }
}