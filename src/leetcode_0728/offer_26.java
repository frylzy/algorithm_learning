package leetcode_0728;

import java.util.LinkedList;
import java.util.Queue;

public class offer_26 {
    public class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }
  }
    public boolean isSubStructure(TreeNode A, TreeNode B) {
        if(A == null || B == null) {
            return false;
        }
        boolean res = false;
        if(A.val == B.val) {
            res = isSub(A, B);
        }
        if(res == false) {
            res = isSubStructure(A.left, B) || isSubStructure(A.right, B);
        }
        return res;
    }
    private boolean isSub(TreeNode A, TreeNode B) {
        if(B == null) {
            return true;
        }
        if(A == null || A.val != B.val) {
            return false;
        }
        return isSub(A.left, B.left) && isSub(A.right, B.right);
    }

    public boolean isSubStructure1(TreeNode A, TreeNode B) {
        if(A == null || B == null) {
            return false;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(A);
        boolean res = false;
        while(!queue.isEmpty()) {
            TreeNode curNode = queue.poll();
            if(curNode != null && curNode.val == B.val) {
                res = isSub1(curNode, B);
                if(res == true) {
                    return true;
                }
            }
            if(curNode.left != null) {
                queue.offer(curNode.left);
            }
            if(curNode.right != null) {
                queue.offer(curNode.right);
            }

        }
        return res;
    }
    private boolean isSub1(TreeNode A, TreeNode B) {
        Queue<TreeNode> queueA = new LinkedList<>();
        Queue<TreeNode> queueB = new LinkedList<>();
        queueA.offer(A);
        queueB.offer(B);
        while(!queueB.isEmpty()) {
            TreeNode curA = queueA.poll();
            TreeNode curB = queueB.poll();
            if(curA == null || curA.val != curB.val) {
                return false;
            }
            if(curB.left != null) {
                queueB.offer(curB.left);
                queueA.offer(curA.left);
            }
            if(curB.right != null) {
                queueB.offer(curB.right);
                queueA.offer(curA.right);
            }
        }
        return true;
    }
}
