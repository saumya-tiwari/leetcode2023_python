/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        
        if(head == null || head.next == null)
            return head;
        
        ListNode listToDo = head.next;
        ListNode reversedList = head;
        
        reversedList.next = null;
        
        while(listToDo != null){
            ListNode temp = listToDo;
            listToDo = listToDo.next;
            
            temp.next = reversedList;
            reversedList = temp;
        }
        
        return reversedList;
        
        
    }
}