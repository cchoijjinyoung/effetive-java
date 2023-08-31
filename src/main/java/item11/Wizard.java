package item11;

import lombok.EqualsAndHashCode;

@EqualsAndHashCode
public class Wizard {
    private final int no;
    private final Feature feature;
    private final String[] friends;

    public Wizard(int no, String ft, String[] friends) {
        this.no = no;
        feature = new Feature(ft);
        this.friends = friends;
    }
}



