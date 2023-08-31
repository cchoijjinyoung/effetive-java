package item11;

import java.util.HashMap;
import java.util.Map;

public class PhoneMain {
    public static void main(String[] args) {
        Map<PhoneNumber, String> m = new HashMap<>();
        PhoneNumber p1 = new PhoneNumber(011, 1111, 1111);
        PhoneNumber p3 = new PhoneNumber(011, 1111, 1111);
        PhoneNumber p2 = new PhoneNumber(02, 222, 2222);
        System.out.println(p1.equals(p2));
        System.out.println("p1의 해시코드 : " + p1.hashCode()); // 1435804085
        System.out.println("p3의 해시코드 : " + p3.hashCode()); // 1435804085
        System.out.println("p2의 해시코드 : " + p2.hashCode()); // 1784662007

        m.put(p1, "아이유");
        m.put(p3, "태연");
        m.put(p2, "제니");

        String s = m.get(new PhoneNumber(011, 1111, 1111));
        System.out.println(m.get(p1).equals(s));
        System.out.println(s);
    }
}
