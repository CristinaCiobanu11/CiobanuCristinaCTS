package observer.models;

public interface IRestaurant {
    void abonareClient(IClient client);
    void dezabonareClient(IClient client);
    void notificare(String mesaj);


}
