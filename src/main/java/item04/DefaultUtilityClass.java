package item04;

public class DefaultUtilityClass {
    public static void main(String[] args) {
        // 자식 클래스의 생성자를 호출하면 UtilityClass의 생성자도 호출되기 때문에,
        // 인스턴스가 방지되지 못한다.
        DefaultUtilityClass defaultUtilityClass = new DefaultUtilityClass();
        // 콘솔 출력 : UtilityClass - Constructor
    }
}
