package factoryMethod;

public class Brancardier extends PersonalSpital {
    public Brancardier(String nume){
        super(nume);
    }

    @Override
    public void afiseazaDescriere() {
        System.out.println("Brancardierul "+super.getNume());
    }

}
