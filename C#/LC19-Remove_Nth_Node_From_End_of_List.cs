/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     public int val;
 *     public ListNode next;
 *     public ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode RemoveNthFromEnd(ListNode head, int n) {
        ListNode cur = head;
        int index = 1;
        int len = 1;
        while(cur.next != null){
            cur = cur.next;
            len++;
        }
        int m = len-n+1;
        cur = head;
        if(m == index){
            head = head.next;
            return head;
        }
        while(index < m-1){
            index++;
            cur = cur.next;
        }
        cur.next = cur.next.next;
        return head;
    }
}