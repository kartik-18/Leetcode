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
        
           // METHOD :- 1 
//         ListNode dummy = new ListNode(0);
//         dummy.next = head;
//         ListNode first = dummy;
//         ListNode second = dummy;
       
        
//         for(int i = 1 ; i<= n+1; i++){
//             first = first.next;
//         }
//         while(first != null){
//             first = first.next;
//             second = second.next;
//         }
//         second.next = second.next.next;
//         return dummy.next;
        
           // METHOD 2
        
        ListNode first = head;
        ListNode second = head;
        
        while(n>0){
            first = first.next;
            n--;
        }
        while(first != null && first.next != null){
            first = first.next;
            second = second.next;
        }
        if(second ==null || second.next == null){return null;}
        else if(second == head && first ==null){head = head.next;}
        else{
            second.next = second.next.next;
        }
        return head;
    }
}