package restaurant.adapter.bucatarie;

import restaurant.adapter.bar.SoftBar;

public class AdapterRestaurant extends SoftBar implements ISoftRestaurant {

    public AdapterRestaurant(String denumire) {
        super(denumire);
    }

    @Override
    public void printeazaNota(double totalPlata) {
        super.printeazaNotaBauturi(totalPlata);
    }
}