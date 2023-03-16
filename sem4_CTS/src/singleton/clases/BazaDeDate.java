package singleton.clases;

public class BazaDeDate {
    private int dimensiuneDate;
    private int numarTabele;

    private String denumire;

    private static BazaDeDate instanta=new BazaDeDate(100,100,"Prima BD");

    public BazaDeDate() {
    }

    public static void setInstanta(BazaDeDate instanta) {
        BazaDeDate.instanta = instanta;
    }

    public void setDimensiuneDate(int dimensiuneDate) {
        this.dimensiuneDate = dimensiuneDate;
    }

    @Override
    public String toString() {
        return "BazaDeDate{" +
                "dimensiuneDate=" + dimensiuneDate +
                ", numarTabele=" + numarTabele +
                ", denumire='" + denumire + '\'' +
                '}';
    }

    private BazaDeDate(int dimensiuneDate, int numarTabele, String denumire) {
        this.dimensiuneDate = dimensiuneDate;
        this.numarTabele = numarTabele;
        this.denumire = denumire;
    }//puteam sa hardcodez datele si aici

    public static BazaDeDate getInstance(){
        return instanta;
    }
}
