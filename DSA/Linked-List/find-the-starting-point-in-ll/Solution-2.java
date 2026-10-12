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
    public ListNode findStartingPoint(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        Boolean isLoop=false;
        while(fast!=null && fast.next!=null) {
            slow=slow.next;
            fast=fast.next.next;
            if(fast==slow) {
                isLoop=true;
                break;
            }
        }

        if(!isLoop) return null;

        ListNode extra=head;
        while(extra!=slow) {
            extra=extra.next;
            slow=slow.next;
        }
        return extra;
    }
}