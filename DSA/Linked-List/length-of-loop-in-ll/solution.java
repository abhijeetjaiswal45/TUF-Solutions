/*Definition of singly linked list:
class ListNode {
    int val;
    ListNode next;

    ListNode() {
        val = 0;
        next = null;
    }

    ListNode(int data1) {
        val = data1;
        next = null;
    }

    ListNode(int data1, ListNode next1) {
        val = data1;
        next = next1;
    }
}
 */

 class Solution {
     public int findLengthOfLoop(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        boolean isLoop=false;
        while(fast!=null && fast.next!=null) {
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast) {
                isLoop=true;
                break;
            }
        }

        if(!isLoop) return 0;
        ListNode extra=head;
        while(extra!=slow) {
            extra=extra.next;
            slow=slow.next;
        }
      int count=0;
      ListNode temp=extra.next;
      while(temp!=extra) {
        count++;
        temp=temp.next;
      }
      return count+1;
     }
 }