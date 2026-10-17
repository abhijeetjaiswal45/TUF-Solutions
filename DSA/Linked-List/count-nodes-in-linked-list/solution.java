// Definition of singly linked list:
// class ListNode {
//     int val;
//     ListNode next;
//     ListNode() { val = 0; next = null; }
//     ListNode(int val) { this.val = val; next = null; }
//     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
// }

class Solution {
    public int countNodes(ListNode head) {
        int count=0;
        ListNode temp=head;
        while(temp!=null) {
            count++;
            temp=temp.next;
        }
        return count;
    }
}