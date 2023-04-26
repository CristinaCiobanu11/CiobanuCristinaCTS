package factoryMethod.main;

import factoryMethod.FactoryBrancardier;
import factoryMethod.FactoryMedic;
import factoryMethod.PersonalSpital;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        FactoryMedic factoryMedic = new FactoryMedic();
        FactoryBrancardier factoryBrancardier = new FactoryBrancardier();


        List<PersonalSpital> list = new ArrayList<>();
        list.add(factoryMedic.crearePersonal("Maria"));
        list.add(factoryBrancardier.crearePersonal("Andrei"));

        for (PersonalSpital ps : list) {
            ps.afiseazaDescriere();
        }
    }
}