package item8.cleaner;

import java.lang.ref.Cleaner;
import java.util.ArrayList;
import java.util.List;

public class 나 {
    public static void main(String[] args) throws InterruptedException {
        Cleaner cleaner = Cleaner.create();

        List<Object> 쓰레기들 = new ArrayList<>();
        방 내방 = new 방(쓰레기들);

        // 클리너에 등록 : 내방이 GC가 될 때, 상태의 Runnable을 사용해서 정리해라.
        cleaner.register(내방, new 방.상태(쓰레기들));

        내방 = null;
        System.gc();
        Thread.sleep(3000L);
    }
}
