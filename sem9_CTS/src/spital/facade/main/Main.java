package spital.facade.main;

import spital.facade.clase.Facade;

public class Main {
    public static void main(String[] args) {

        Facade facade1=new Facade();
        facade1.interneazaPacient("Maria");
        facade1.interneazaPacient("Andrei");
        facade1.interneazaPacient("Federico");
        facade1.interneazaPacient("Maria");
        facade1.interneazaPacient("Maria");
    }
}