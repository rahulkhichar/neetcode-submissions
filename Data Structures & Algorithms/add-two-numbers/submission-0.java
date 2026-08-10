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

    // public ListNode reverseListNode(ListNode head) {


    //     ListNode curr = head;
    //     ListNode pre = null;

    //     while(curr != null) {

    //         ListNode next = curr.next;
    //         curr.next = pre;
    //         pre = curr;
    //         curr = next;

    //     }

    //     return pre;
    // }

   
    public ListNode addTwoNumbers(ListNode l1Rev, ListNode l2Rev) {

    //   ListNode l1Rev =  reverseListNode(l1);
    //   ListNode l2Rev = reverseListNode(l2);

      ListNode  head = new ListNode();
      ListNode curr = head;
      int rem = 0;

      while(l1Rev != null && l2Rev != null) {
       
        int val = (l1Rev.val+l2Rev.val) + rem;

        curr.next = new ListNode(val%10);
        curr = curr.next;
        rem = val/10;
        l1Rev = l1Rev.next;
        l2Rev = l2Rev.next;
        

      }
       while(l1Rev != null ) {
       
        int val = l1Rev.val + rem;

        curr.next = new ListNode(val%10);
        curr = curr.next;
        rem = val/10;
        l1Rev = l1Rev.next;

      }

       while( l2Rev != null) {
       
        int val = l2Rev.val + rem;

        curr.next = new ListNode(val%10);
        curr = curr.next;
        rem = val/10;
        l2Rev = l2Rev.next;

      }
      if(rem > 0) {
        curr.next = new ListNode(rem);
      }




      return head.next;


  
        
    }
}
