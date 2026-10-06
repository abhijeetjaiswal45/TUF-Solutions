/*
// Definition for a Node.
class ListNode {
    public int data;
    public ListNode prev;
    public ListNode next;
    public ListNode();
    public ListNode(int data);
    public ListNode(int data, ListNode prev, ListNode next);
};
*/

class Solution {
    public ListNode deleteTail(ListNode head) {
        if(head==null || head.next==null) {
            return null;
        }
        ListNode temp=head;
        while(temp.next!=null) {
            temp=temp.next;
        }
        temp.prev.next=null;
        temp.prev=null;
        return head;
    }
}