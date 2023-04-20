package restaurant.adapter.main;

import restaurant.adapter.bar.ISoftBar;
import restaurant.adapter.bar.SoftBar;
import restaurant.adapter.bucatarie.AdapterObiecteRestaurant;
import restaurant.adapter.bucatarie.AdapterRestaurant;
import restaurant.adapter.bucatarie.Bucatarie;
import restaurant.adapter.bucatarie.ISoftRestaurant;

public class Main {
    public static void imprimare(ISoftRestaurant restaurant, double notaPalta) {
        restaurant.printeazaNota(notaPalta);
    }

    public static void main(String[] args) {
        ISoftBar bar = new SoftBar("Hugo");
        bar.printeazaNotaBauturi(240);

        ISoftRestaurant bucatarie = new Bucatarie("George");
        bucatarie.printeazaNota(300);

        AdapterRestaurant adapter = new AdapterRestaurant("Alcadibo");
        adapter.printeazaNota(500);

        AdapterObiecteRestaurant adapterObiecte = new AdapterObiecteRestaurant(bar);
        imprimare(adapterObiecte, 150);
    }
}