package restaurant.proxy.clase;

public class Restaurant implements IRestaurant {
    private String nume;

    public Restaurant(String nume) {
        this.nume = nume;
    }

    @Override
    public void rezervareMasa(int numarPersoane) {
        System.out.println("Masa a fost rezervata pentru " + numarPersoane + " persoane" + " la restaurantul " + this.nume);
    }
}
