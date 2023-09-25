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
    
    public void reverse(ListNode s, ListNode e){
        ListNode p = null;
        ListNode c = s;
        ListNode n = s.next;
        
        while(p != e){
            // c.next = p;
            // p =c;
            // c = n;
            // if(n != null) n = n.next;
            
            ListNode temp = c.next ;
            c.next = p;
            p = c;
            c = temp;
            
        }
    }
    
    public ListNode reverseKGroup(ListNode head, int k) {
      
        if(head == null || head.next == null || k ==1) return head;
        
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        
        ListNode beforeStart = dummy;
        ListNode e = head;
    
        int i = 0;
        while(e != null){
            i++;
            if(i % k == 0){
                //Reversal
                ListNode s = beforeStart.next;
                ListNode temp = e.next;
                reverse(s,e);
                
                beforeStart.next = e;
                s.next = temp;
                
                beforeStart = s;
                e = temp;
            }
            else{
                e= e.next;
            }
        }
        
        return dummy.next;
    }
}