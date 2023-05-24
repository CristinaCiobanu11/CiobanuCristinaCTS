package JUnit;

import JUnit.Exceptie;

import org.junit.jupiter.api.function.Executable;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

class PersoanaTest {
    @org.junit.jupiter.api.Test
    void getVarstaTestBicep() {
            IPersoana persoana=new Persoana("Maria", "6011106257241");
            assertEquals(21, persoana.getVarsta());

        }

    @org.junit.jupiter.api.Test
    void getVarstaTestBoundaryNouNascut() {
        IPersoana persoana=new Persoana("Alex", "5230524257241");
        assertEquals(0, persoana.getVarsta());

    }

    @org.junit.jupiter.api.Test
    void getVarstaTestBounndaryLimitaInferioara() {
        IPersoana persoana=new Persoana("Alex", "5000623672514");
        assertEquals(22, persoana.getVarsta());
    }

    @org.junit.jupiter.api.Test
    void getVarstaTestBounndaryLimitaSuperioara() {
        IPersoana persoana=new Persoana("Andreea", "2991233672514");
        assertEquals(23, persoana.getVarsta());
    }

    //nu putem calcula CNP ul pe baza varstei, deci nu putem verifica Inversion

    @org.junit.jupiter.api.Test
    void getVarstaErrorExceptionNouNascut() {
        IPersoana persoana=new Persoana("Andreea", "6312319092671");

        assertThrows(Exceptie.class, new Executable() {
            @Override
            public void execute() throws Throwable {
                    persoana.getVarsta();
                }
        });
}


    @org.junit.jupiter.api.Test
    void getVarstaPerformance() {
        IPersoana persoana=new Persoana("Maya", "60012311237315");
        assertTimeout(Duration.ofMillis(100), ()->persoana.getVarsta());
    }

    @org.junit.jupiter.api.Test
    void getCNPCaractere() {
        Persoana persoana=new Persoana("Andrei", "5001231123731");
        assertEquals(13, persoana.getCNP().length());
    }

    @org.junit.jupiter.api.Test
    void ordineVarsta() {
        Persoana persoana1=new Persoana("Andrei", "50112121237315");
        Persoana persoana2=new Persoana("Ema", "60012121237315");

        assertTrue(persoana1.getVarsta()<persoana2.getVarsta());
    }

    @org.junit.jupiter.api.Test
    void getVarstaCardinality() {
        Persoana persoana=new Persoana("Andrei", "52205151237315");

        assertEquals(1, persoana.getVarsta());
    }



}
