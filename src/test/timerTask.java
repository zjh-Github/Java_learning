package test;

import sun.dc.pr.PRError;

import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Month;
import java.time.MonthDay;
import java.util.Calendar;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class timerTask {
    private static final long PERIOD_DAY  =60 * 1000;
    public static void main(String[] args) throws ParseException {
/*        // 规定的每天时间15:33:30运行
        final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd '11:23:30'");
        // 首次运行时间
        Date startTime = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(sdf.format(new Date()));

        // 如果今天的已经过了 首次运行时间就改为明天
        if(System.currentTimeMillis() > startTime.getTime())
            startTime = new Date(startTime.getTime() + PERIOD_DAY );*/
//       timerTask();
        int year=Calendar.getInstance().get(Calendar.YEAR);
        int month=Calendar.getInstance().get(Calendar.MONTH)+1;
        StringBuffer stringBuffer=new StringBuffer();
        stringBuffer.append(year);
        stringBuffer.append(0);
        stringBuffer.append(month);
        System.out.println("presentDateMonth:"+stringBuffer);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        Calendar now = Calendar.getInstance();
        Date today = now.getTime();
        String dateEnd = sdf.format(today);
        now.add(Calendar.MONTH, -3);
        today = now.getTime();
        String dateStart = sdf.format(today);
        System.out.println(dateEnd+" -- "+dateStart);
        Timer timer=new Timer();
        Date date=Calendar.getInstance().getTime();
        TimerTask timerTask=new TimerTask() {
            @Override
            public void run() {
                System.out.println(stringBuffer);
            }
        };
        timer.schedule(timerTask,date, PERIOD_DAY);
    }
    public static void timerTask(){
        Calendar calendar=Calendar.getInstance();
        /*calendar.set(Calendar.HOUR_OF_DAY,16);
        calendar.set(Calendar.MINUTE,32);
        calendar.set(Calendar.SECOND,0);*/

        Date date=calendar.getTime();
        if (date.before(new Date())){
            date=addDay(date,1);
        }
        Timer timer = new Timer();

        TimerTask task = new TimerTask(){
            @Override
            public void run() {
                // 要执行的代码
                try {
                    testStringBuffer.test();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        };
        // 以每24小时执行一次
        timer.schedule(task, date, PERIOD_DAY);
    }
    public static Date addDay(Date date, int num) {
        Calendar startDT = Calendar.getInstance();
        startDT.setTime(date);
        startDT.add(Calendar.DAY_OF_MONTH, num);
        return startDT.getTime();
    }
}
