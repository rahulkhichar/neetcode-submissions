

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
      
      if(head == null) return null;
      ListNode dummyNode = new ListNode(0);
      dummyNode.next = head;
      
      ListNode  firstNode = dummyNode;

      while( n >= 0) {
        // if(firstNode == null) return head;

        firstNode = firstNode.next;
        // if(firstNode == null) return 
        n--;
        // firstNode = firstNode.next;
      }

      ListNode lastNode = dummyNode;

      while(firstNode != null) {
        firstNode = firstNode.next;
        lastNode = lastNode.next;
      }

      lastNode.next = lastNode.next.next;
      return dummyNode.next;

     
    }
}
