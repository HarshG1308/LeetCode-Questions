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
    public ListNode swapPairs(ListNode head) {
        ListNode curr = head;
        ListNode next = null, prev = null;
        while(curr!=null && curr.next!=null){
            next = curr.next.next;
            curr.next.next = null;
            if(head == curr){
                head = swap(curr);
            } else{
                prev.next = swap(curr);
            }
            curr.next = next;
            prev = curr;
            curr = next;
        }
        return head;
    }

    ListNode swap(ListNode head){
        ListNode temp = head;
        head = head.next;
        head.next = temp;
        return head;
    }
}