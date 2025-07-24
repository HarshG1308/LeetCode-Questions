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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null || head.next == null) return null;
        ListNode temp = head; int len = 0;
        while(temp != null){
            temp = temp.next; len++;
        }
        int c = len - n ; temp = head;
        if(c == 0){
            return head.next;
        } else{
            for (int i = 1; i < c; i++) {
            temp = temp.next;
            }
            if (temp.next != null) {
                temp.next = temp.next.next;
            } else {
                temp.next = null;
            }
        }
        return head;
    }
}