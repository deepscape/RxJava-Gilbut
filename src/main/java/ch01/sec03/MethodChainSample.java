package ch01.sec03;

import io.reactivex.Flowable;

public class MethodChainSample {
    public static void main(String[] args) {
        // 인자와 데이터를 순서대로 통지하는 Flowable 생성
        Flowable<Integer> flowable = Flowable.just(1,2,3,4,5,6,7,8,9,10)
                                             .filter(data -> data % 2 == 0)
                                             .map(data -> data * 100);

        flowable.subscribe(data -> System.out.println("data = " + data));
    }
}
