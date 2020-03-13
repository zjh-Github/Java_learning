package LeetCode;

import java.util.LinkedList;
import java.util.Objects;
import java.util.Queue;

public class QueueToStack {
    static Queue<Integer> queueA;
//    static Queue<Integer> queueB;

    /**
     * Initialize your data structure here.
     */
    public QueueToStack() {
        queueA = new LinkedList<>();
//        queueB = new LinkedList<>();
    }

    /**
     * Push element x onto stack.
     */
    public void push(int x) {
        queueA.add(x);
        int size = queueA.size();
        while (size > 1) {
            queueA.offer(queueA.remove());
            size--;
        }
       /* Queue temp = queueA;
        queueA = queueB;
        queueB = temp;*/
    }

    /**
     * Removes the element on top of the stack and returns that element.
     */
    public int pop() {
        return queueA.poll();
    }

    /**
     * Get the top element.
     */
    public int top() {
        return queueA.peek();
    }

    /**
     * Returns whether the stack is empty.
     */
    public boolean empty() {
        return queueA.isEmpty();
    }

    public static void main(String[] args) {
        QueueToStack obj = new QueueToStack();
        obj.push(1);
        obj.push(2);
        obj.push(3);
        System.out.println(obj.top());
        System.out.println(obj.pop());
        System.out.println(obj.top());
        int param_2 = obj.pop();
        int param_3 = obj.top();
        boolean param_4 = obj.empty();

    }
}
