package RxJava;


import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;


public class HelloWorld {

    public static void main(String[] args) {
        System.out.println("Hello World");

//Observable部分,被观察者部分
        Observable<String> observable = Observable.create(new ObservableOnSubscribe<String>() {
            @Override
            public void subscribe(ObservableEmitter<String> observableEmitter) throws Exception {
                observableEmitter.onNext("我是被观察的对象");
                observableEmitter.onComplete();
            }
        });

    }
}

