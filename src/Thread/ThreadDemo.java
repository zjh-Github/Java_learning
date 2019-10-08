package Thread;

//线程主体类
class MyThread extends Thread{
    private  String title;
    public MyThread(String title){
        this.title=title;
    }
    //线程的主体方法
    @Override
    public void run() {
        for (int i=0 ;i < 10;i++){
            System.out.println(this.title + "运行,i = " + i);
        }
    }
}
public class ThreadDemo {
    public static void main(String[] args) {
        new  MyThread("thread->A").start();
        new  MyThread("thread->B").start();
        new  MyThread("thread->C").start();
    }
}
