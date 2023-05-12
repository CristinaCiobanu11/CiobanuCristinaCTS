package strategy.main;

import strategy.classes.Calator;
import strategy.classes.PlataCardBancar;
import strategy.classes.PlataCardCalatorii;
import strategy.classes.PlataCardSms;

public class Main {

    public static void main(String[] args) {
        Calator calator = new Calator("Dani");
        calator.platesteBilet(30);
        calator.setMetodaPlata(new PlataCardSms());

        calator.platesteBilet(25);
        calator.setMetodaPlata(new PlataCardBancar());

        calator.platesteBilet(25);
        calator.setMetodaPlata(new PlataCardCalatorii());
        calator.platesteBilet(25);
    }

}