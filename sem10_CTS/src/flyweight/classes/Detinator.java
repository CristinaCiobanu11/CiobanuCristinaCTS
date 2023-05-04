package flyweight.classes;

public class Detinator implements IClientBancar{

    private String nume;
    private String nrTelefon;
    private String adresa;

    public Detinator(String nume, String nrTelefon, String adresa) {
        this.nume = nume;
        this.nrTelefon = nrTelefon;
        this.adresa = adresa;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Detinator{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", nrTelefon='").append(nrTelefon).append('\'');
        sb.append(", adresa='").append(adresa).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void descriere(Cont cont) {
        System.out.println(this.toString()+cont.toString());
    }
}
