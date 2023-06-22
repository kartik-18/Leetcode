/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int count1 = 1;
        int count2 = 1;
        
        ListNode cur1 = headA;                
        ListNode cur2 = headB;
        
        while(cur1 != null){
            cur1 = cur1.next;
            count1++;
        }
        while(cur2 != null){
            cur2 = cur2.next;
            count2++;
        }
        
        cur1 = headA;
        cur2 = headB;
        
        if(count1 > count2){
            int move = count1 - count2;
            while(move >= 1){
                cur1 = cur1.next;
                move--;
            }
            
            while(cur1 != null && cur2 != null){
                if(cur1 == cur2){return cur1;}
                cur1 = cur1.next;
                cur2 = cur2.next;
            }
        }
        if(count1 <= count2){
            int move = count2 - count1;
            while(move >= 1){
                cur2 = cur2.next;
                move--;
            }
            
            while(cur1 != null && cur2 != null){
                if(cur1 == cur2){return cur1;}
                cur1 = cur1.next;
                cur2 = cur2.next;
            }
        }
        return null;
    }
}