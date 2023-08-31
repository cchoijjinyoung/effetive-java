package item8.autoclosable;

public class App {

    public static void main(String[] args) {
        // try-with-resource 를 사용 - 알아서 close() 메서드가 호출된다.
        try(방 내방 = new 방()) {
            // TODO 자원 반납 처리가 됨.
        }
    }
}
