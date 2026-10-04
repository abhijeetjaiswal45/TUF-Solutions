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
    public ListNode deleteKthNode(ListNode head, int k) {
        if(head.next==null) {
            return null;
        }
        if(k==1) {
            ListNode temp=head;
           head = temp.next;
            temp.next=null;
            return head;
        }
        int count=0;
         ListNode temp=head;
        while(temp!=null) {
           count++;
           if(count==k-1) {
            temp.next=temp.next.next;
            break;
           }
           else {
            temp=temp.next;
           }
        }
        return head;
    }
}