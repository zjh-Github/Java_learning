package Thread;

//线程主体类
class MyThread1 implements Runnable {
    private  String title;
    public MyThread1(String title){
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
public class RunnableDemo {
    public static void main(String[] args) {
        //继承thread类
        Thread threadA=new Thread(new MyThread1("thread->A"));
        Thread threadB=new Thread(new MyThread1("thread->B"));
        Thread threadC=new Thread(new MyThread1("thread->C"));
        threadA.start();
        threadB.start();
        threadC.start();
        //实现runnable接口
       for (int i=0;i<3;i++){
           String title="thread->"+i;
           new Thread(()->{
              for (int j=0;j<10;j++){
                  System.out.println(title + "运行,j = " + j);
              }
           }).start();
       }
    }
}
