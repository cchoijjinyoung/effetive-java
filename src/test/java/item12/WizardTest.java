package item12;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigInteger;

class WizardTest {

    @Test
    void toString_테스트() {
        Wizard w1 = new Wizard("포터", "제임스");
        Wizard w2 = new Wizard("포터", "해리");
        BigInteger b1 = new BigInteger("123123123");
        BigInteger b2 = new BigInteger(b1.toString());
        Assertions.assertEquals(w1, w2);
    }
}