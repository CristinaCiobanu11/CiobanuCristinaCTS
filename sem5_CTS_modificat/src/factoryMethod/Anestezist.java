package factoryMethod;

import simpleFactory.PersonalSpital;

public class Anestezist extends PersonalSpital {

    private Integer anVechime;
    public Anestezist(String nume, Integer anVechime){
        super(nume);
        this.anVechime=anVechime;
    }

    @Override
    public void afiseazaDescriere() {
        System.out.println("Anestezistul "+super.nume + "are vechiimea"+ this.anVechime);
    }
}
