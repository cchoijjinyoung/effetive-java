package item11;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Wizard, String> map = new HashMap<>();
        Wizard w1 = new Wizard(1, "번개흉터", new String[]{"론, 헤르미온느"});
        Wizard w2 = new Wizard(2, "금발", new String[]{"크레브, 고일"});

        map.put(w1, "해리포터");
        map.put(w2, "말포이");

        String s = map.get(new Wizard(1, "번개흉터", new String[]{"론, 헤르미온느"}));
        System.out.println(s);
    }
}
