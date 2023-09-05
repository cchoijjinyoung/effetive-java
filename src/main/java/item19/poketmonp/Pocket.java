package item19.poketmonp;

public class Pocket extends MyArrayList {

    public boolean checkWaterPoketmon(Poketmon poketmon){
        if (poketmon.getType().equals("water")) {
            return true;
        } else {
            return false;
        }
    }
}
