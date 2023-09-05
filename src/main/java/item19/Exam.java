package item19;

import java.util.List;

public class Exam {
    public static void main(String[] args) {
        Wizard 진영 = new Wizard();

        진영.attackAll(List.of(
                new Enemy("도희"),
                new Enemy("지은"),
                new Enemy("태희")));

        System.out.println(진영.get기력());
    }
}
