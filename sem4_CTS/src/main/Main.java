package main;

import singleton.clases.BazaDeDate;
import singleton.clases.Secretariat;

public class Main {
    public static void main(String[] args) {
        Secretariat secretariat1=Secretariat.getInstanta(10,20);
        Secretariat secretariat2=Secretariat.getInstanta(10,20);

        System.out.println(secretariat1);
        System.out.println(secretariat2);

        BazaDeDate bazaDeDate1=BazaDeDate.getInstance();
        BazaDeDate bazaDeDate2=BazaDeDate.getInstance();
        bazaDeDate1.setDimensiuneDate(200);
        bazaDeDate2.setDimensiuneDate(300);

        System.out.println(bazaDeDate1);
        System.out.println(bazaDeDate2);
    }
}