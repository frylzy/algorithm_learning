package leetcode_0728;

public class offer_24 {
    public class ListNode2 {
        int val;
        ListNode2 next;
        ListNode2(int x) { val = x; }
    }
    public ListNode2 reverseList(ListNode2 head) {
        // 用一个指针记录当前的节点，另一个指针记录当前下一个节点
        ListNode2 pre = null;
        ListNode2 cur = head;
        while(cur != null) {
            ListNode2 tmp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = tmp;
        }
        return pre;
    }
}
