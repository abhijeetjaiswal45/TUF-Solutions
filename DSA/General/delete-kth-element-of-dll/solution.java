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
    public ListNode deleteKthElement(ListNode head, int k) {
        if(head==null) {
            return null;
        }
        if(k==1) {
            head=head.next;
            if (head != null) {
                head.prev = null;
            }
            return head;
        }
        ListNode temp=head;
        int count=0;
        while(temp!=null) {
            count++;
            if(count==k) {
                break;
            }
            else {
                temp=temp.next;
            }
        }
        if (temp.prev != null) {
            temp.prev.next = temp.next;
        }
        if (temp.next != null) {
            temp.next.prev = temp.prev;
        }
        temp.prev=null;
        temp.next=null;
        return head;
    }
}