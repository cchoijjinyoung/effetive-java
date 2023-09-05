package item19.poketmonp;

import java.util.AbstractCollection;

public class Main {
    public static void main(String[] args) {
        Bag bag = new Bag();
        Poketmon poketmon = new Poketmon("꼬마돌", "돌");
        bag.add(poketmon);
        System.out.println(bag.size());

        Pocket pocket = new Pocket();
        pocket.secretAdd(poketmon);

        pocket.secretAdd(new Poketmon("꼬마돌", "바위"));
        System.out.println(pocket.get(0));

    }
}
