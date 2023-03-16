package singletonRegistry.main;

import singletonRegistry.InstitutiePublica;

public class Main{
    public static void main(String[] args) {
        InstitutiePublica politie = InstitutiePublica.getInstitutie("Politie");
        InstitutiePublica pompieri = InstitutiePublica.getInstitutie("Pompieri");
        InstitutiePublica politieLocala = InstitutiePublica.getInstitutie("politieLocala");

        politie.setNrAngajati(5);
        pompieri.setNrAngajati(10);
        politieLocala.setNrAngajati(20);

        System.out.println(politie);
        System.out.println(pompieri);
        System.out.println(politieLocala);
    }
}
