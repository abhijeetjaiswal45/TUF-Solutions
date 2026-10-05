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
    public ListNode insertAtKthPosition(ListNode head, int X, int K) {
      ListNode node = new ListNode(X);
      if(head==null) {
        return node;
      }
    if(K==1) {
        node.next=head;
        head=node;
        return head;
    }
    int count=0;
    ListNode temp=head;
    while(temp!=null) {
        count++;
        if(count==K-1) {
            node.next=temp.next;
            temp.next=node;
            break;
        }
        temp=temp.next;
    }
    return head;
    }
}