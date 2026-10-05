/*
Definition of singly linked list:
class ListNode{
    public int data;
    public ListNode next;
    ListNode() { data = 0; next = null; }
    ListNode(int x) { data = x; next = null; }
    ListNode(int x, ListNode next) { data = x; this.next = next; }
}
*/

class Solution {
    public ListNode insertBeforeX(ListNode head, int X, int val) {
        ListNode node = new ListNode(val);
        if(head==null) {
            return node;
        }
        if(head.data==X) {
            node.next=head;
            head=node;
            return head;
        }
        ListNode temp = head;
        while(temp.next!=null) {
            if(temp.next.data==X) {
                node.next=temp.next;
                temp.next=node;
                break;
            }
            temp=temp.next;
        }
        return head;
    }
}