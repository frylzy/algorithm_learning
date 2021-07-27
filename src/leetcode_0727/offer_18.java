package leetcode_0727;

public class offer_18 {
    /**
     * Definition for singly-linked list.
     * */
      public class ListNode {
         int val;
         ListNode next;
         ListNode(int x) { val = x; }
      }

    public ListNode deleteNode(ListNode head, int val) {
        ListNode dummyHead = new ListNode(-1);
        dummyHead.next = head;
        ListNode tmp = dummyHead;
        while(tmp.next != null && tmp.next.val != val) {
            tmp = tmp.next;
        }
        if(tmp.next != null) {
            tmp.next = tmp.next.next;
        }
        return dummyHead.next;
    }
}
