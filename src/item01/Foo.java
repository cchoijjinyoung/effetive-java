package item01;

import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;

/**
 * "생성자 대신 정적 팩터리 메서드를 고려하라."
 *
 * 핵심정리 :
 * 정적 팩터리 메서드와 public 생성자는 각자의 쓰임새가 있으니 상대적인 장단점을 이해하고 사용하는 것이 좋다.
 * 그렇다고 하더라도 정적 팩터리를 사용하는 게 유리한 경우가 더 많으므로 무작정 public 생성자를 제공하던 습관이 있다면 고치자.
 *
 */

public class Foo {
    String name;
    String address;

    // 정적 팩터리 메서드만 제공하면 하위 클래스를 만들 수 없다.
    // 상속을 하려면 public이나 protected생성자가 필요하기 때문이다.
    private Foo() {}

    // 정적 팩터리 메서드
    public static Foo withName(String name) {
        Foo foo = new Foo();
        foo.name = name;
        return foo;
    }

    public static Foo withAddress(String address) {
        Foo foo = new Foo();
        foo.address = address;
        return foo;
    }

    public static void main(String[] args) {
        // Foo foo = new Foo();

        Foo foo2 = Foo.withName("topy");

        Foo foo3 = Foo.withAddress("korea 거주");

        EnumSet enumSet = EnumSet.allOf(Color.class);
        // 이 때 enum의 원소수가 64개 이하냐 초과냐에 따라 다른 클래스가 반환된다.
        // 해당 클래스가 뭔지 클라이언트는 알 필요가 없다.

    }

    enum Color {
        RED, BLUE ,ORANGE
    }
}
