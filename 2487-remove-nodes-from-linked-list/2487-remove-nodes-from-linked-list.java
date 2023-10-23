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
    public ListNode removeNodes(ListNode head) {
        
        head = rev(head);
        ListNode cur = head;
        ListNode prev = head;
        int ma = head.val;
        head = head.next;
        while(head != null){
            if(head.val >= ma){
                ma = head.val;
                prev = head;
                head = head.next;
            }else{
                prev.next = head.next;
                head = prev.next;
            }
        }
        return rev(cur);
        
    }
    
    public ListNode rev(ListNode head){
        ListNode cur = head;
        ListNode prev = null;
        
        while(cur != null){
            ListNode temp = cur.next;
            cur.next = prev;
            prev = cur;
            cur = temp;
        }
        return prev;
    }
}