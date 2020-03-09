package test;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
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

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        Calendar now = Calendar.getInstance();

        Date date = now.getTime();
        //发放时间月份
        String putoutMonth = simpleDateFormat.format(date);
        System.out.println("date:" + putoutMonth);
    }

}
