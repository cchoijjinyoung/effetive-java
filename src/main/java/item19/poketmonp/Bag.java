package item19.poketmonp;

import java.util.ArrayList;
import java.util.Collection;

public class Bag extends ArrayList<Poketmon> {
    @Override
    public boolean add(Poketmon poketmon) {
        if (!checkWaterPoketmon(poketmon)) {
            return false;
        }
        return super.add(poketmon);
    }

    @Override
    public boolean addAll(Collection<? extends Poketmon> poketmonList) {
        for (Poketmon poketmon : poketmonList) {
            checkWaterPoketmon(poketmon);
        }
        return super.addAll(poketmonList);
    }

    public boolean checkWaterPoketmon(Poketmon poketmon){
        if (poketmon.getType().equals("water")) {
            return true;
        } else {
            return false;
        }
    }
}
