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

    public ListNode reverseList(ListNode head) {
      ListNode curr = head;
      ListNode preNode = null;


      while(curr != null) {
        ListNode nextNode = curr.next;
        curr.next = preNode;
        preNode = curr;
        curr = nextNode;
      }

      return preNode;

    }
    public void reorderList(ListNode head) {

      // int lengthOfNode = 0;
      ListNode slowNode =  head;
      ListNode fastNode = head.next;

      while(fastNode != null && fastNode.next != null) {
        slowNode = slowNode.next;
        fastNode = fastNode.next.next;
      }


      ListNode revNode = reverseList(slowNode);

     

      ListNode first = head;
      ListNode second = revNode;

      while(first != null) {
          ListNode  firstNext= first.next;
          ListNode  secondNext = second.next;
          first.next = second;
          second.next = firstNext;
          first = firstNext;
          second = secondNext;
      }

        
    }
}
