package ch01.sec01;

import io.reactivex.Flowable;

public class HelloWorldSample {
    public static void main(String[] args) {
        // 데이터를 통지하는 생산자 생성
        Flowable<String> flowable = Flowable.just("Hello", "World");
        // 통지받은 데이터를 출력
        flowable.subscribe(data -> System.out.println(data));
    }

}
