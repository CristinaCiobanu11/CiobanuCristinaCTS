package jUnit;

import model.IPersoana;
import model.Persoana;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

class PersoanaTest {

    @org.junit.jupiter.api.Test
    void getVarstaTestRight() {
        IPersoana persoana = new Persoana("Maria", "6011106834113");
        assertEquals(21, persoana.getVarsta());
    }

    @org.junit.jupiter.api.Test
    void getVarstaTestBoundaryLimitaSuperioara() {
        IPersoana persoana = new Persoana("Alex", "5230524341122");
        assertEquals(0, persoana.getVarsta());
    }

    @org.junit.jupiter.api.Test
    void getVarstaTestBoundaryLimitaInferioara() {
        IPersoana persoana = new Persoana("Andrei", "5000100349742");
        assertEquals(23, persoana.getVarsta());
    }

    @org.junit.jupiter.api.Test
    void getVarstaTestErrorCondition() {
        IPersoana persoana = new Persoana("Maya", "6270205237512");
        assertThrows(ExceptieNenascut.class, () -> {
            persoana.getVarsta();
        });
    }

    @org.junit.jupiter.api.Test
    void getVarstaTestPerformance() {
        IPersoana persoana = new Persoana("Alex", "5230524341131");
        assertTimeout(Duration.ofMillis(100), () -> {
            persoana.getVarsta();
        });
    }

    @org.junit.jupiter.api.Test
    void CheckerConformanceCNP() {
        Persoana persoana = new Persoana("Ana", "6230524341201");
        assertEquals(13, persoana.CNP.length());
    }

    @org.junit.jupiter.api.Test
    void ordineVarstaPersoane() {
        Persoana persoana1 = new Persoana("Cristiana", "6010100349232");
        Persoana persoana2 = new Persoana("Mihaela", "6000100349832");
        assertTrue(persoana1.getVarsta() < persoana2.getVarsta());
    }

    @org.junit.jupiter.api.Test
    void getVarstaShouldThrowExceptionCNPNull() {
        Persoana persoana1 = new Persoana("Andrei", null);
        assertThrows(ExceptieCNPNull.class, () -> {
            persoana1.getVarsta();
        });
    }

    @org.junit.jupiter.api.Test
    void getVarstaCardinality() {
        IPersoana persoana = new Persoana("Ionut", "5220524295444");
        assertEquals(1,persoana.getVarsta());
    }

    @org.junit.jupiter.api.Test
    void verificaConstructorCrosscheck() {
        Persoana persoana1 = new Persoana("Andrei", "5220524295444");
        Persoana persoana2 = new Persoana();

        persoana2.setCNP("5220524295444");
        persoana2.setNume("Andrei");
        assertEquals(persoana1.getCNP(), persoana2.getCNP());
        assertEquals(persoana1.getNume(), persoana2.getNume());
    }
}