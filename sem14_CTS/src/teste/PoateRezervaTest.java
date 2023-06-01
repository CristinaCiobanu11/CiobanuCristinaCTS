package teste;

import dubluri.StubPersoanaMajora;
import dubluri.StubPersoanaMinora;
import model.PachetTuristic;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PoateRezervaTest {

    @org.junit.jupiter.api.Test
    void unMinorNuPoateRezerva() {
        StubPersoanaMinora persoana=new StubPersoanaMinora();
        PachetTuristic pachet=new PachetTuristic(persoana, "Bucuresti", 0.00);
        assertFalse(pachet.poateRezerva());
    }

    @org.junit.jupiter.api.Test
    void unMajorPoateRezerva() {
        StubPersoanaMajora persoana=new StubPersoanaMajora();
        PachetTuristic pachet=new PachetTuristic(persoana, "Bucuresti", 0.00);
        assertTrue(pachet.poateRezerva());
    }

}