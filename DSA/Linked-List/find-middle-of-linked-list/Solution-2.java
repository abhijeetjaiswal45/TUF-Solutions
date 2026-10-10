
/*Definition for Singly Linked List
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
    public ListNode middleOfLinkedList(ListNode head) {
        ListNode temp=head;
        ListNode node=head;
        ListNode flag=null;
        int count=0;
        while(temp!=null) {
            count++;
            temp=temp.next;
        }
        int middle=count/2+1;
        int count1=0;
        while(node!=null) {
            count1++;
            if(count1==middle) {
                flag=node;
                break;
            }
            node=node.next;
        }
        return flag;
    }
}
