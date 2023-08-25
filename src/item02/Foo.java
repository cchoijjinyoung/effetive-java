package item02;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * "생성자에 매개변수가 많다면 빌더를 고려하라.
 *
 * 핵심정리 :
 * 생성자나 정적 팩터리가 처리해야 할 매개변수가 많다면 빌더 패턴을 선택하는 게 더 낫다.
 * 매개변수 중 다수가 필수가 아니거나 같은 타입이면 특히 더 그렇다.
 * 빌더는 점층적 생성자보다 클라이언트 코드를 읽고 쓰기가 훨씬 간결하고, 자바 빈즈보다 훨씬 안전하다.
 */
public class Foo {
    public static void main(String[] args) {
        String s = "";
        Map map = new HashMap<>();
        Map map2 = new HashMap();
        Set set = map.keySet();
        Set set2 = map2.keySet();
        System.out.println(set == set2);
    }
}
