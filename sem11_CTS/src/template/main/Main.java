package template.main;

import template.models.IMasa;
import template.models.Masa;
import template.models.MasaRezervata;

public class Main {
    public static void main(String[] args) {
        IMasa masa = new Masa(1);
        masa.ocupaMasa();

        IMasa masaRezervata = new MasaRezervata(2, "14:30");
        masaRezervata.ocupaMasa();
    }
}