package spital.decorator.main;

import spital.decorator.clase.DecoratorAbstract;
import spital.decorator.clase.FurnizeazaRezultat;
import spital.decorator.clase.RezultatOnline;
import spital.decorator.clase.RezultatPeHartie;

public class Main {
    public static void main(String[] args) {
        FurnizeazaRezultat rezultat=new RezultatPeHartie();
        rezultat.afiseazaRezultat("raceala");

        //ca sa putem afisa si rez online avem nevoie sa ne decoram obiectul
        //vom folosi un decorator

        DecoratorAbstract rezultatOnline=new RezultatOnline(rezultat);
        rezultatOnline.afiseazaRezultatOnline("gripa");

    }
}
