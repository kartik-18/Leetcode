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
        
        if(head == null)return null;
        
        if(head.next == null) return head;

        ListNode Dummy = new ListNode(0);
        Dummy.next = head;
        
        ListNode cur = Dummy;
        
        while(cur.next!=null && cur.next.next != null){
            
            ListNode swap1 = cur.next;                        
            ListNode swap2 = cur.next.next;
            
            swap1.next = swap2.next;
            swap2.next = swap1;
            cur.next = swap2;
            cur = swap1;

        }
        
        return Dummy.next;
    }
}