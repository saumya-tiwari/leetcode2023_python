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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
       ListNode p1 = list1, p2 = null, p3 = list2;
        
       for(int i = 1; i < a ; i++)
           p1 = p1.next;
        
        p2 = p1;
        
        for(int i = a; i <= b; i++)
            p2 = p2.next;
        
          while(p3.next != null) {
            p3 = p3.next;
        }
        
        p1.next = list2;
        p3.next = p2.next;
        
        return list1;
        
    }
}