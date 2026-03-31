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
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists == null || lists.length == 0){
            return null;
        }

        return divide(lists, 0, lists.length - 1);
    }

    public ListNode divide(ListNode[] lists, int l, int r){
        if(l > r){
            return null;
        }
        if(l == r){
            return lists[l];
        }
        int m = (l + r) / 2;
        ListNode left = divide(lists, l, m);
        ListNode right = divide(lists, m + 1, r);
        return conqurer(left, right);

    }

    public ListNode conqurer(ListNode left, ListNode right){
        ListNode dummy = new ListNode();
        ListNode current = dummy;
        while(left != null && right != null){
            if(left.val <= right.val){
                current.next = left;
                left = left.next;

            }else{
                current.next = right;
                right = right.next;
            }
            current = current.next;
        }

        if(left != null){
            current.next = left;
        }

        if(right != null){
            current.next = right;
        }

        return dummy.next;
    }
}
