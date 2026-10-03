class Solution {
    public int getLength(ListNode head) {
        int length=0;
        ListNode temp=head;
        while(temp!=null) {
            length++;
            temp=temp.next;
        }
        return length;
    }
}