package LeetCode;


import static jdk.nashorn.internal.objects.Global.print;

public class MoreThread1 {
    public MoreThread1() {

    }

    public void first(Runnable printFirst) throws InterruptedException {

        // printFirst.run() outputs "first". Do not change or remove this line.
        printFirst.run();
    }

    public void second(Runnable printSecond) throws InterruptedException {

        // printSecond.run() outputs "second". Do not change or remove this line.
        printSecond.run();
    }

    public void third(Runnable printThird) throws InterruptedException {

        // printThird.run() outputs "third". Do not change or remove this line.
        printThird.run();
    }

    public void one() {
        print("one");
    }

    public void two() {
        print("two");
    }

    public void three() {
        print("three");
    }
}
