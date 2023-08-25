package item8.cleaner;

import java.util.List;

public class 방 {

    private List<Object> 쓰레기들;

    public 방(List<Object> 쓰레기들) {
        this.쓰레기들 = 쓰레기들;
    }

    // static으로 만든 이유 :
    // 상태 클래스에서 '방'을 참조하면 안되기 때문 :
    // '방'이 GC될 때(없어질 때), 수행되는 작업인데,
    // GC되려고 할 때 다시 '방'을 참조하게 되면, 객체가 부활할 수 있기 때문이다.
    // 그래서 이 예제는 '방'의 '쓰레기들'을 참조한 예제이다.
    public static class 상태 implements Runnable {
        private List<Object> 청소할_쓰레기들;

        public 상태(List<Object> 청소할_쓰레기들) {
            this.청소할_쓰레기들 = 청소할_쓰레기들;
        }

        @Override
        public void run() {
            청소할_쓰레기들 = null;
            System.out.println("방 청소");
        }
    }
}
