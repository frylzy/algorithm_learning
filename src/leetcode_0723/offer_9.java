package leetcode_0723;

import java.util.ArrayDeque;
import java.util.Deque;

public class offer_9 {
    class CQueue {
        private Deque<Integer> stack1;
        private Deque<Integer> stack2;
        public CQueue() {
            stack1 = new ArrayDeque<>();
            stack2 = new ArrayDeque<>();
        }

        public void appendTail(int value) {
            if(stack2.isEmpty()) {
                stack2.addLast(value);
            } else {
                while(!stack2.isEmpty()) {
                    stack1.addLast(stack2.removeLast());
                }
                stack2.addLast(value);
                while(!stack1.isEmpty()) {
                    stack2.addLast(stack1.removeLast());
                }
            }
        }

        public int deleteHead() {
            if(stack2.isEmpty()) {
                return -1;
            }
            return stack2.removeLast();
        }
    }

/**
 * Your CQueue object will be instantiated and called as such:
 * CQueue obj = new CQueue();
 * obj.appendTail(value);
 * int param_2 = obj.deleteHead();
 */
class CQueue1 {
    private Deque<Integer> stack1;
    private Deque<Integer> stack2;
    public CQueue1() {
        stack1 = new ArrayDeque<>();
        stack2 = new ArrayDeque<>();
    }

    public void appendTail(int value) {
        stack1.addLast(value);
    }

    public int deleteHead() {
        if(stack2.isEmpty()) {
            while(!stack1.isEmpty()) {
                stack2.addLast(stack1.removeLast());
            }
        }
        if(stack2.isEmpty()) {
            return -1;
        }
        return stack2.removeLast();
    }
}

/**
 * Your CQueue object will be instantiated and called as such:
 * CQueue obj = new CQueue();
 * obj.appendTail(value);
 * int param_2 = obj.deleteHead();
 */
}
