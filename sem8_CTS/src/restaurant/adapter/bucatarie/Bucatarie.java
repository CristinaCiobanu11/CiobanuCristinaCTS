package restaurant.adapter.bucatarie;

import restaurant.adapter.bar.ISoftBar;

public class Bucatarie implements ISoftRestaurant {
    private String numeBucatar;

    public Bucatarie(String numeBucatar) {
        this.numeBucatar = numeBucatar;
    }

    @Override
    public void printeazaNota(double totalPlata) {
        System.out.println("Nota dumneavoastra este in valoare de " + totalPlata);
    }
}