package leetcode_0728;

public class offer_22 {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public ListNode getKthFromEnd(ListNode head, int k) {
        //这里是否需要判断k
        ListNode tmp = head;
        ListNode cur = head;
        while(k > 0 && tmp != null) {
            tmp = tmp.next;
            k--;
        }
        if(tmp == null) {
            return head;
        }
        while(tmp != null) {
            tmp = tmp.next;
            cur = cur.next;
        }
        return cur;
    }
}
