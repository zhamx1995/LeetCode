/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     public int val;
 *     public ListNode next;
 *     public ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode MergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode cur = new ListNode(0);
        bool first = true;
        if(l1 == null && l2 == null){
            return l1;
        }
        while((l1 != null) || (l2 != null)){
            ListNode temp;
            if(l1 == null){
                temp = new ListNode(l2.val);
                l2 = l2.next;
            }
            else if(l2 == null){
                temp = new ListNode(l1.val);
                l1 = l1.next;
            }
            else if(l1.val < l2.val){
                temp = new ListNode(l1.val);
                l1 = l1.next;
            }
            else if(l1.val > l2.val){
                temp = new ListNode(l2.val);
                l2 = l2.next;
            }
            else{
                temp = new ListNode(l1.val);
                l1 = l1.next;
            }
            
            if(first){
                head = temp;
                cur = head;
                first = false;
            }
            else{
                cur.next = temp;
                cur = cur.next;
            }
            
        }
        return head;
    }
}