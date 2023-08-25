package item8.finalizerAttack;

// 단순히 name이 홍길동인 유저는 생성자에 들어올 때 예외를 던지게 만들었다.
public class User {

    private String name;

    public User(String name) {
        this.name = name;

        if (name.equals("홍길동")) {
            throw new IllegalArgumentException("홍길동은 가입 금지입니다.");
        }
    }
    public void hello() {
        System.out.println("안녕하세요. " + this.name + "입니다.");
    }

    @Override
    protected final void finalize() throws Throwable {
        super.finalize();
    }
}
