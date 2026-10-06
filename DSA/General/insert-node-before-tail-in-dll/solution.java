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
    public ListNode insertBeforeTail(ListNode head, int X) {
        ListNode node=new ListNode(X,null,null);
        if(head==null) {
            return node;
        }
        if(head.next==null) {
            head.prev=node;
            node.next=head;
            head=node;
            return head;
        }
        ListNode temp= head;
        while(temp.next!=null) {
            temp=temp.next;
        }
        temp.prev.next=node;
        node.prev=temp.prev;
        temp.prev=node;
        node.next=temp;
        return head;
    }
}
