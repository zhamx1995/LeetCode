/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     public int val;
 *     public ListNode next;
 *     public ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode AddTwoNumbers(ListNode l1, ListNode l2) {
        int shift = 0;
        ListNode head;
        if(l1.val + l2.val >= 10){
            shift = 1;
            head = new ListNode(l1.val+l2.val-10);
        }
        else{
            head = new ListNode(l1.val+l2.val);
        }
        
        ListNode cur = head;
        while((l1.next != null) && (l2.next != null)){
            l1 = l1.next;
            l2 = l2.next;
            if(l1.val+l2.val+shift >= 10){
                cur.next = new ListNode(l1.val+l2.val+shift-10);
                shift = 1;
            }
            else{
                cur.next = new ListNode(l1.val+l2.val+shift);
                shift = 0;
            }
            cur = cur.next;
        }
        
        if(l1.next == null){
            while(l2.next != null){
                l2 = l2.next;
            if(shift+l2.val >= 10){
                cur.next = new ListNode(l2.val + shift-10);
                shift = 1;
            }
            else{
                cur.next = new ListNode(l2.val + shift);
                shift = 0;
            }
            cur = cur.next;
            }
            if(shift == 1){
                cur.next = new ListNode(1);
            }
        }
        if(l2.next == null){
            while(l1.next != null){
                l1 = l1.next;
            if(shift+l1.val >= 10){
                cur.next = new ListNode(l1.val + shift-10);
                shift = 1;
            }
            else{
                cur.next = new ListNode(l1.val + shift);
                shift = 0;
            }
            cur = cur.next;
            }
            if(shift == 1){
                cur.next = new ListNode(1);
            }
        }
        return head;
    }
}