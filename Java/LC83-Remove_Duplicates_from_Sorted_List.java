/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode cur = head;
        if(head == null){
            return head;
        }
        while(cur != null){
            if(cur.next == null){
                return head;
            }
            else{
            if(cur.next.val == cur.val){
                cur.next = cur.next.next;
            }
            else{
            cur = cur.next;
            }
            }
        }
        return head;
    }
}