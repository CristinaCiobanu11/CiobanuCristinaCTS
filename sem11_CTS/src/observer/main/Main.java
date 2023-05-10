package observer.main;

import observer.models.Client;
import observer.models.IClient;
import observer.models.IRestaurant;
import observer.models.Restaurant;

public class Main {
    public static void main(String[] args) {

        IClient client=new Client("Ciprian");
        IClient client2=new Client("Dragos");
        IClient client3=new Client("Carmen");

        Restaurant restaurant=new Restaurant("Tortuga");
        restaurant.introduceOfertaNoua();
        restaurant.abonareClient(client);
        restaurant.adaugaDiscount();

        restaurant.abonareClient(client2);
        restaurant.abonareClient(client3);

        restaurant.dezabonareClient(client);
        restaurant.introduceOfertaNoua();
    }
}