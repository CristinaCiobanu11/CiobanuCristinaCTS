package template.models;

public class MasaRezervata extends IMasa {
    private String oraRezervare;

    public MasaRezervata(int numar, String oraRezervare) {
        super(numar);
        this.oraRezervare = oraRezervare;
    }

    @Override
    protected void curataMasa() {
        System.out.println("Am curatat masa  cu numarul " + super.getNumar() + " inainte de ora " + this.oraRezervare);
    }

    @Override
    protected void aseazaServetele() {
        System.out.println("Am asezat servetelele pentru masa cu numarul " + super.getNumar() + " inainte de ora " + this.oraRezervare);
    }

    @Override
    protected void aseazaTacamuri() {
        System.out.println("Am asezat tacamurile pentru masa cu numarul " + super.getNumar() + " inainte de ora " + this.oraRezervare);
    }

    @Override
    protected void invitaPersoane() {
        System.out.println("Am invitat persoanele la masa cu numarul " + super.getNumar() + " la ora " + this.oraRezervare);
    }
}