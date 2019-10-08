package test;

import java.util.PriorityQueue;
import java.util.Queue;

public class Main {

    public static void main(String[] args) throws Exception {

        Queue<Integer> queue = new PriorityQueue<>();
        queue.offer(2);
        queue.offer(1);
        queue.offer(4);
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
    }

}
