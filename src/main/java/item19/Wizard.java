package item19;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Wizard extends Beginner {
    private int 기력 = 100;

    @Override
    public void attack(Enemy enemy) {
        기력 -= 10;
        super.attack(enemy);
    }

    @Override
    public void attackAll(List<Enemy> enemyList) {
        기력 -= enemyList.size() * 10;
        super.attackAll(enemyList);
    }

    public String get기력() {
        return "현재 기력은 " + 기력 + "입니다.";
    }
}

