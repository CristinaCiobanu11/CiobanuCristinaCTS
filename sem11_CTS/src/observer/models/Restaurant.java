package observer.models;

import java.util.ArrayList;
import java.util.List;

public class Restaurant implements IRestaurant{
    private String nume;

    private List<IClient> listaClienti;

    public Restaurant(String nume) {
        this.nume = nume;
        this.listaClienti = new ArrayList<>();
    }

    @Override
    public void abonareClient(IClient client) {
        this.listaClienti.add(client);
    }

    @Override
    public void dezabonareClient(IClient client) {
        this.listaClienti.remove(client);
    }

    @Override
    public void notificare(String mesaj) {
        for(IClient client:listaClienti){
            client.primesteNotificare(mesaj);
        }
    }

    public void introduceOfertaNoua(){
        String mesaj=new String(this.nume+" introduce oferta noua. ");
        notificare(mesaj);
    }

    public void adaugaDiscount(){
        String mesaj=new String(this.nume+" adauga un discount. ");
        notificare(mesaj);
    }
}
