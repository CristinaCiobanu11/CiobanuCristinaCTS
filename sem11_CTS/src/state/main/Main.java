package state.main;

import state.models.Masa;

public class Main {
    public static void main(String[] args) {
        Masa masa=new Masa(1);

        masa.ocupaMasa();

        masa.anulareRezervare();
        masa.elibereazaMasa();

        masa.rezervaMasa();
        masa.elibereazaMasa();
    }
}
