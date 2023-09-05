package item19;

import java.time.Instant;
import java.util.List;

public class Beginner extends Person {
    public void attack(Enemy enemy) {
        System.out.println(enemy + "는(은) 쓰러졌습니다.");
    }

    /**
     * @implSpec
     * 이 메서드는 enemyList 객체를 받아 순회하면서 Person 클래스의 targeting을 호출한다.
     * targeting 은 내부적으로 attack()을 호출한다.
     *
     * @param enemyList
     */
    public void attackAll(List<Enemy> enemyList) {
        for (Enemy enemy : enemyList) {
            targeting(enemy);
        }
    }

}
