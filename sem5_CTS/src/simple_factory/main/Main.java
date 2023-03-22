package simple_factory.main;

import simple_factory.PersonalSpital;
import simple_factory.SimpleFactory;
import simple_factory.TipPersonal;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        SimpleFactory simpleFactory=new SimpleFactory();
        List<PersonalSpital> listaPersonal=new ArrayList<>();
        PersonalSpital personalSpital1= simpleFactory.createPersonal(TipPersonal.Medic, "Andrei");
        PersonalSpital personalSpital2= simpleFactory.createPersonal(TipPersonal.Medic, "Maria");
        PersonalSpital personalSpital3= simpleFactory.createPersonal(TipPersonal.Brancardier, "Rares");
        PersonalSpital personalSpital4= simpleFactory.createPersonal(TipPersonal.Asistent, "Maria");
        PersonalSpital personalSpital5=simpleFactory.createPersonal(TipPersonal.Anestezist, "Anca",10);
        listaPersonal.addAll(List.of(personalSpital1, personalSpital2, personalSpital3, personalSpital4, personalSpital5));

        for(PersonalSpital personalSpital:listaPersonal){
            personalSpital.afiseazaDescriere();
        }
        }

    }
