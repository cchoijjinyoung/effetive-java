package item04;

public class UtilityClass {

    /**
     * 이 클래스는 인스턴스를 만들 수 없습니다.
     */
    private UtilityClass() {
        throw new AssertionError("잘못됐어. 생성자를 호출하면 안돼");
    }

    public static String hello() {
        return "hello";
    }

    public static void main(String[] args) {
        UtilityClass.hello();
        UtilityClass utilityClass = new UtilityClass();
    }
}
