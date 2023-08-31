package item8.autoclosable;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.List;

public class 방 implements AutoCloseable {

    private int 쓰레기들_갯수 = 100;

    public void autoCleanUp() {
        System.out.println("자동 청소");
        this.쓰레기들_갯수 = 0;
    }

    @Override
    public void close() {
        try {
            autoCleanUp();
        } catch (Exception e) {
            throw new RuntimeException("faild to cleanUp ");
        }
    }
}
