/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     public int val;
 *     public ListNode next;
 *     public ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode ReverseKGroup(ListNode head, int k) {
        if(k == 1){
            return head;
        }
        if(head == null){
            return head;
        }
        Stack reverse = new Stack();
        ListNode cur = head;
        ListNode prev = head;
        ListNode list = head;
        bool first = true;
        int index = 1;
        while(cur != null){
            reverse.Push(cur);
            cur = cur.next;
            if(index%k == 0){
                ListNode result = (ListNode) reverse.Pop();
                ListNode tail = result;
                if(first){
                    list = result;
                    first = false;
                }
                else{
                     prev.next = result;
                }
                
                while(reverse.Count > 0){
                   tail.next = (ListNode) reverse.Pop();
                   tail = tail.next;
                }
                prev = tail;
                prev.next = cur;
                reverse.Clear();
            }
            index++;
        }
        return list;
    }
}