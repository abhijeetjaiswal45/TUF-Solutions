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
    public boolean isPalindrome(ListNode head) {
        if(head==null || head.next==null) {
            return true;
        }
        ListNode slow=head;
        ListNode fast=head;
        while(fast.next!=null && fast.next.next!=null) {
            slow=slow.next;
            fast=fast.next.next;
        }

        ListNode secondHalfHead=reverse(slow.next);
        ListNode firstHalf=head;
        ListNode secondHalf=secondHalfHead;
        boolean result=true;

        while(secondHalf!=null) {
            if(secondHalf.val!=firstHalf.val) {
                result=false;
                break;
            }
            firstHalf=firstHalf.next;
            secondHalf=secondHalf.next;
        }
        slow.next=reverse(secondHalfHead);
        return result;
    }

    public ListNode reverse(ListNode head) {
        ListNode prev=null;
        ListNode curr=head;
        while(curr != null) {
            ListNode nextTemp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=nextTemp;
        }
        return prev;
    }
}