package item12;

import item11.Feature;
import lombok.EqualsAndHashCode;

public class Wizard {
    private String lastName;
    private String firstName;

    @Override
    public String toString() {
        return "Wizard{" +
                "성 ='" + lastName + '\'' +
                '}';
    }

    public Wizard(String lastName, String firstName) {
        this.lastName = lastName;
        this.firstName = firstName;
    }
}



