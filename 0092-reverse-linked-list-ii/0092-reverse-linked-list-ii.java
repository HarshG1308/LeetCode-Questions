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
        if (head == null) return head;
        if(left == right) return head;
        ListNode ans = new ListNode(0);
        ans.next = head;
        ListNode prev = ans;
        for (int i = 1; i < left; i++) prev = prev.next;
        ListNode abhi = prev.next;
        for (int i = 0; i < right - left; i++) {
            ListNode temp = abhi.next;
            abhi.next = temp.next;
            temp.next = prev.next;
            prev.next = temp;
        }
        return ans.next;
    }
}
