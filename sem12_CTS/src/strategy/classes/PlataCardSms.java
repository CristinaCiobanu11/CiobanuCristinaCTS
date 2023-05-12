package strategy.classes;

public class PlataCardSms implements TipPlata{

    @Override
    public void plateste(double pretBilet) {
        System.out.println("Plata biletului in valoare de " + pretBilet + " a fost efectuata prin plata sms.");
    }

}