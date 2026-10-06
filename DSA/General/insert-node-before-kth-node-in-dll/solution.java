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
    public ListNode insertBeforeKthPosition(ListNode head, int X, int K) {
        ListNode node = new ListNode(X);
        if(head==null) {
            return node;
        }
        if(K==1) {
            head.prev=node;
            node.next=head;
            head=node;
            return head;
        }
        ListNode temp=head;
        int count=0;
        while(temp!=null) {
            count++;
            if(count==K) {
                break;
            }
            temp=temp.next;
        }
        if(temp.prev!=null) {
        temp.prev.next=node;
        node.prev=temp.prev;
        }
        temp.prev=node;
        node.next=temp;
        return head;
    }
}