package item8.cleaner_as_a_safetynet;

import java.lang.ref.Cleaner;

public class 방 implements AutoCloseable {
    private static final Cleaner cleaner = Cleaner.create();

    private static class 상태 implements Runnable {
        int 쓰레기_갯수;

        상태(int 쓰레기_갯수) {
            this.쓰레기_갯수 = 쓰레기_갯수;
        }

        @Override
        public void run() {
            System.out.println("방 청소");
            쓰레기_갯수 = 0;
        }
    }
    private final 상태 내_방_상태;

    private final Cleaner.Cleanable cleanable;

    public 방(int 쓰레기_갯수) {
        내_방_상태 = new 상태(쓰레기_갯수);
        // 어떤 오브젝트(this)가 GC가 될 때, 이 자원(내_방_상태)을 해제하라.
        cleanable = cleaner.register(this, 내_방_상태);
    }

    @Override
    public void close() {
        cleanable.clean();
    }
}
