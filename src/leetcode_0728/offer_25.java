package leetcode_0728;

public class offer_25 {
    public class ListNode3 {
        int val;
        ListNode3 next;
        ListNode3(int x) { val = x; }
    }
    public ListNode3 mergeTwoLists(ListNode3 l1, ListNode3 l2) {
        //重新开始一个链表
        ListNode3 dummyHead = new ListNode3(-1);
        ListNode3 cur = dummyHead;
        ListNode3 cur1 = l1;
        ListNode3 cur2 = l2;
        while(cur1 != null && cur2 != null) {
            if(cur1.val < cur2.val) {
                cur.next = cur1;
                cur1 = cur1.next;
            } else {
                cur.next = cur2;
                cur2 = cur2.next;
            }
            cur = cur.next;
        }
        if(cur1 != null){
            cur.next = cur1;
        } else {
            cur.next = cur2;
        }
        return dummyHead.next;
    }
}
