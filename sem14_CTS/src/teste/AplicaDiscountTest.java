package teste;

import dubluri.FakePersoana;
import model.PachetTuristic;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AplicaDiscountTest {

    @Test
    void testNuSeAplicaDiscount() {
        FakePersoana fakePersoana=new FakePersoana();
        fakePersoana.setGetVarstaValue(6);
        PachetTuristic pachetTuristic=new PachetTuristic(fakePersoana, "Eforie", 1000.00);

        pachetTuristic.aplicaDiscountVarstnici(70);
        assertEquals(1000, pachetTuristic.getPret());
    }

    @Test
    void testAplicaDiscount() {
        FakePersoana fakePersoana=new FakePersoana();
        fakePersoana.setGetVarstaValue(89);
        PachetTuristic pachetTuristic=new PachetTuristic(fakePersoana, "Eforie", 1000.00);

        pachetTuristic.aplicaDiscountVarstnici(10);
        assertEquals(900, pachetTuristic.getPret());
    }
}