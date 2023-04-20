package restaurant.adapter.bucatarie;

import restaurant.adapter.bar.ISoftBar;

public class AdapterObiecteRestaurant implements ISoftRestaurant{
    private ISoftBar softBar;

    public AdapterObiecteRestaurant(ISoftBar softBar) {
        this.softBar = softBar;
    }

    @Override
    public void printeazaNota(double totalPlata) {
        this.softBar.printeazaNotaBauturi(totalPlata);
    }
}
